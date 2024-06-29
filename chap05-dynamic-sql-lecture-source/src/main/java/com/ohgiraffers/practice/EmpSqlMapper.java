package com.ohgiraffers.practice;

import com.ohgiraffers.compractice.EmpDTO;
import com.ohgiraffers.compractice.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface EmpSqlMapper {
    List<EmpDTO> searchEmp(SearchCriteria searchCriteria);

    List<EmpDTO> searcEmpByCodeOrSearchAll(SearchCriteria searchCriteria);

    List<EmpDTO> searchMenuByNameORDept(Map<String, Object> criteria);
}
