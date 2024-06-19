package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {

//    @Select("/*쿼리문 작성위치*/")
//    @Update()
//    @Delete()
//    @Insert()

    @Select("select  curdate()")
    java.util.Date selectSysdate();
}
