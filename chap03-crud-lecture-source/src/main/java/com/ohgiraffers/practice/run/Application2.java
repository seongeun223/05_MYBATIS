package com.ohgiraffers.practice.run;

import com.ohgiraffers.practice.common.JobController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobController jobController = new JobController();

        do {
            System.out.println("============= 오지라퍼 메뉴 관리 시스템 =============");
            System.out.println("1. 모든 직급 조회하기");
            System.out.println("2. 직급 코드로 직급명 조회하기");
            System.out.println("3. 직급 추가하기");
            System.out.println("4. 직급 수정하기");
            System.out.println("5. 직급 삭제하기");
            System.out.println("직원 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    jobController.selectAllJob();
                    break;
                case 2:
                    jobController.selectJobByCode(inPutJobCode());
                    break;
                case 3:
                    jobController.registJob(inPutJob());
                    break;
                case 4:
                    jobController.modifyJob(inPutModifyJob());
                    break;
                case 5:
                    jobController.deleteJob(inPutJobCode());
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }
        } while (true);
    }
    private static Object inPutJobCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("직급 코드를 입력하세요 : ");
        String jobCode = sc.next();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobCode", jobCode);

        return parameter;
    }

    private static Object inPutModifyJob() {
        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 직급 코드를 입력하세요. : ");
        String jobCode = sc.nextLine();
        System.out.println("수정할 직급명을 입력하세요. : ");
        String jobName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobCode", jobCode);
        parameter.put("jobName", jobName);

        return parameter;

    }

    private static Object inPutJob() {
        Scanner sc = new Scanner(System.in);
        System.out.println("직급 코드를 입력하세요. : ");
        String jobCode = sc.nextLine();
        System.out.println("직급명을 입력하세요. : ");
        String jobName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobCode", jobCode);
        parameter.put("jobName", jobName);

        return parameter;

    }





}

