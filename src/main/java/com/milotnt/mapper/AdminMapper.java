package com.milotnt.mapper;

import com.milotnt.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    Admin selectByAccountAndPassword(Admin admin);

}
