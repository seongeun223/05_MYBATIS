package com.ohgiraffers.practice;

import java.util.List;

public interface EmpMapper {

    List<EmpDTO> selectAllEmp();

    EmpDTO selectEmpByCode(String empId);

    EmpDTO selectEmpByName(String empName);

    int registEmp(EmpDTO emp);

    int modifyEmp(EmpDTO emp);

    int deleteEmp(String empId);
}
