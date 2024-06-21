package com.ohgiraffers.practice.run;


import com.ohgiraffers.practice.common.EmpController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpController empController = new EmpController();

        do {
            System.out.println("============= 오지라퍼 메뉴 관리 시스템 =============");
            System.out.println("1. 모든 직원 조회하기");
            System.out.println("2. 직원 번호로 직원 조회하기");
            System.out.println("3. 직원 이름으로 조회하기");
            System.out.println("4. 직원 추가하기");
            System.out.println("5. 직원 수정하기");
            System.out.println("6. 직원 삭제하기");
            System.out.println("직원 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    empController.selectAllEmp();
                    break;
                case 2:
                    empController.selectEmpByCode(inputEmpId());
                    break;
                case 3:
                    empController.selectEmpByName(inputEmpName());
                    break;
                case 4:
                    empController.registEmp(inPutEmp());
                    break;
                case 5:
                    empController.modifyEmp(inputModifyEmp());
                    break;
                case 6:
                    empController.deleteEmp(inputEmpId());
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }
        } while (true);
    }

    public static Map<String, String> inputEmpId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("직원 번호를 입력하세요 : ");
        String empId = sc.next();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);

        return parameter;
    }

    public static Map<String, String> inputEmpName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("직원 이름을 입력하세요 : ");
        String empName = sc.next();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empName", empName);

        return parameter;
    }

    private static Map<String, String> inPutEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("직원 번호를 입력하세요. : ");
        String empId = sc.nextLine();
        System.out.println("직원 이름을 입력하세요. : ");
        String empName = sc.nextLine();
        System.out.println("주민등록번호를 입력하세요. : ");
        String empNo = sc.nextLine();
        System.out.println("직업코드를 입력하세요. : ");
        String jobCode = sc.nextLine();
        System.out.println("급여등급을 입력하세요. : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);

        return parameter;
    }

    private static Map<String, String> inputModifyEmp() {
        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 직원 번호를 입력하세요. : ");
        String empId = sc.nextLine();
        System.out.println("수정할 직원 이름을 입력하세요. : ");
        String empName = sc.nextLine();
        System.out.println("수정할 직업 코드를 입력하세요. : ");
        String jobCode = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("jobCode", jobCode);

        return parameter;
    }
}

