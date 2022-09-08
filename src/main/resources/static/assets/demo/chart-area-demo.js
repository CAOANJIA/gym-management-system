// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Area Chart Example
var ctx = document.getElementById("myAreaChart");
var xAxis=[];
var yAxis=[];
$.getJSON("/queryXiaoFeiSumAmountByMonth", function (data) {
  for(var i = 0; i < data.length; i++){
    xAxis.push(data[i].mon);
    yAxis.push(data[i].sumAmount);
  }
})
alert(xAxis[9]);
var myLineChart = new Chart(ctx, {
  type: 'line',
  data: {
    labels: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
    // labels: xAxis,
    datasets: [{
      label: "Consumption",
      lineTension: 0.3,
      backgroundColor: "rgba(2,117,216,0.2)",
      borderColor: "rgba(2,117,216,1)",
      pointRadius: 5,
      pointBackgroundColor: "rgba(2,117,216,1)",
      pointBorderColor: "rgba(255,255,255,0.8)",
      pointHoverRadius: 5,
      pointHoverBackgroundColor: "rgba(2,117,216,1)",
      pointHitRadius: 50,
      pointBorderWidth: 2,
      // data: [10000, 30162, 26263, 18394, 18287, 28682, 31274, 33259, 25849, 24159, 32651, 31984, 38451],
      data: yAxis,
      // data: [yAxis[0].value(), yAxis[1].value(), yAxis[2].value(), yAxis[3].value(),
      //        yAxis[4].value(), yAxis[5].value(), yAxis[].value(), yAxis[0].value(),
      //        yAxis[0].value(), yAxis[0].value(), yAxis[0].value(), yAxis[0].value()]
    }],
  },
  options: {
    scales: {
      xAxes: [{
        time: {
          unit: 'date'
        },
        gridLines: {
          display: false
        },
        ticks: {
          maxTicksLimit: 7
        }
      }],
      yAxes: [{
        ticks: {
          min: 0,
          max: 40000,
          maxTicksLimit: 5
        },
        gridLines: {
          color: "rgba(0, 0, 0, .125)",
        }
      }],
    },
    legend: {
      display: false
    }
  }
});
