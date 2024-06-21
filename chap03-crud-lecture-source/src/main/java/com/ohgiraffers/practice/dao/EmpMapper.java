package com.ohgiraffers.practice.dao;

import com.ohgiraffers.practice.dto.EmpDTO;

import java.util.List;

public interface EmpMapper {

    List<EmpDTO> selectAllEmp();

    EmpDTO selectEmpByCode(String empId);

    EmpDTO selectEmpByName(String empName);

    int registEmp(EmpDTO emp);

    int modifyEmp(EmpDTO emp);

    int deleteEmp(String empId);
}
