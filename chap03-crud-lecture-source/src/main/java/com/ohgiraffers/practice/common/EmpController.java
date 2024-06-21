package com.ohgiraffers.practice.common;


import com.ohgiraffers.practice.dto.EmpDTO;
import com.ohgiraffers.practice.service.EmpService;
import com.ohgiraffers.practice.view.PrintResult;

import java.util.List;
import java.util.Map;

public class EmpController {

    private final PrintResult printResult;
    private final EmpService empService;

    public EmpController() {
        printResult = new PrintResult();
        empService = new EmpService();
    }

    public void selectAllEmp() {

        List<EmpDTO> empList = empService.selectAllEmp();

        if(empList != null) {
            printResult.printEmpList(empList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectEmpByCode(Map<String, String> parameter) {
        String empId = parameter.get("empId");

        EmpDTO emp = empService.selectEmpByCode(empId);

        if(emp != null) {
            printResult.printEmp(emp);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }
    public void selectEmpByName(Map<String, String> parameter) {
        String empName = parameter.get("empName");

        EmpDTO emp = empService.selectEmpByName(empName);

        if(emp != null) {
            printResult.printEmp(emp);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmp(Map<String, String> parameter) {

        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmpDTO emp = new EmpDTO();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        emp.setEmpNo(empNo);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);

        if(empService.registEmp(emp)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyEmp(Map<String, String> parameter) {

        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String jobCode = parameter.get("jobCode");

        EmpDTO emp = new EmpDTO();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        emp.setJobCode(jobCode);

        if(empService.modifyEmp(emp)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteEmp(Map<String, String> parameter) {

        String empId = parameter.get("empId");

        if(empService.deleteEmp(empId)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }


    }
}
