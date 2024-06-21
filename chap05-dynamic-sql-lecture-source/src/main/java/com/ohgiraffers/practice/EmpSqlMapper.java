package com.ohgiraffers.practice;

import com.ohgiraffers.compractice.EmpDTO;
import com.ohgiraffers.compractice.SearchCriteria;

import java.util.List;

public interface EmpSqlMapper {
    List<EmpDTO> searchEmp(SearchCriteria searchCriteria);
}
