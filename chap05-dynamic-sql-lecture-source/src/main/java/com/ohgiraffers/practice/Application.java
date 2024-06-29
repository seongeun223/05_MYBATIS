package com.ohgiraffers.practice;



import com.ohgiraffers.compractice.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("========== 마이바티스 동적 SQL (조건문) ==========");
            System.out.println("1. if 확인하기");
            System.out.println("2. trim (where, set) 확인하기");
            System.out.println("9. 종료하기");
            System.out.println("메뉴를 선택하세요. : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    ifSubEmp();
                    break;
                case 2:
                    trimSubEmp();
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        } while (true);
    }


    private static void ifSubEmp() {

        Scanner sc = new Scanner(System.in);
        EmpService empService = new EmpService();
        do {
            System.out.println("=========== if 서브메뉴 ===========");
            System.out.println("1. 직원명 또는 사원번호로 검색하여 직원 목록 보여주기");
            System.out.println("9. 이전 메뉴로");
            System.out.println("번호를 입력하세요. : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    empService.searchEmp(inputSearchCriteria());
                    break;
                case 9:
                    break;
            }
        } while (true);
    }

    private static SearchCriteria inputSearchCriteria() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색 기준을 입력해주세요.(name or id) : ");
        String condition = sc.nextLine();
        System.out.println("검색어를 입력해주세요. : ");
        String value = sc.nextLine();

        return new SearchCriteria(condition, value);
    }

    private static void trimSubEmp() {

        Scanner sc = new Scanner(System.in);
        EmpService empService = new EmpService();
        do {
            System.out.println("=========== trim 서브메뉴 ===========");
            System.out.println("1. 검색조건이 있는 경우 사원 코드로 조회, 없으면 전체조회");
            System.out.println("2. 사원 혹은 부서로 검색, 단 사원과 부서 둘 다 일치하는 경우도 검색하며," +
                    "검색조건이 없는 경우 전체 검색");
            System.out.println("3. 원하는 사원 정보만 수정하기");
            System.out.println("9. 이전 메뉴로");
            System.out.println("메뉴 번호를 입력하세요. : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    empService.searchEmpByCodeOrSearchAll(inputAllOrOne());
                    break;
                case 2:
                    empService.searchEmpByNameORDept(inputSearchCriteriaMap());
                    break;
//                case 3:
//                    empService.modifyEmp(inputChangeInfo());
//                    break;
                case 9:
                    break;
            }
        } while (true);
        }


    private static SearchCriteria inputAllOrOne() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색 조건을 입력하시겠습니까?(예 or 아니오) : ");
        boolean hasSearchValue = "예".equals(sc.nextLine()) ? true : false;

        SearchCriteria searchCriteria = new SearchCriteria();
        if(hasSearchValue) {
            System.out.println("검색할 사원 번호를 입력하세요 : ");
            String id = sc.nextLine();
            searchCriteria.setCondition("empId");
            searchCriteria.setValue(id);
        }

        return searchCriteria;
    }

    private static Map<String, Object> inputSearchCriteriaMap() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 조건을 입력하세요(dept or name or both or null : ");
        String condition = sc.nextLine();

        Map<String, Object> criteria = new HashMap<>();

        if("dept".equals(condition)) {

            System.out.println("검색할 부서 코드를 입력하세요 : ");
            String deptValue = sc.nextLine();

            criteria.put("deptValue", deptValue);
        } else if ("name".equals(condition)) {

            System.out.println("검색할 이름을 입력하세요 : ");
            String nameValue = sc.nextLine();

            criteria.put("nameValue", nameValue);

        } else if ("both".equals(condition)) {

            System.out.println("검색할 이름을 입력해주세요 : ");
            String nameValue = sc.nextLine();
            System.out.println("검색할 부서코드를 입력하세요 : ");
            String deptValue = sc.nextLine();

            criteria.put("nameValue", nameValue);
            criteria.put("deptValue", deptValue);

        }
        return criteria;
    }


//    private static Object inputChangeInfo() {
//    }
}

