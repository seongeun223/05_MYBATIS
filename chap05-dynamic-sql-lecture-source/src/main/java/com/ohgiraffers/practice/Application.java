package com.ohgiraffers.practice;



import com.ohgiraffers.compractice.SearchCriteria;

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
//                case 2:
//                    trimSubEmp();
//                    break;

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
}
