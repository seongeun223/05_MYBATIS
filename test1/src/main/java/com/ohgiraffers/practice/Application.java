package com.ohgiraffers.practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 문자열로 받은 시간을 Time으로
        // DateTimeFormatter / LocalTime

        Scanner sc = new Scanner(System.in);

        System.out.println("변경할 출발 시간을 입력하세요 : ");
        String dTime = sc.nextLine();
        System.out.println("변경할 도착 시간을 입력하세요 : ");
        String aTime = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime depTime = LocalTime.parse(dTime, dateTimeFormatter);
        LocalTime arrivalTime = LocalTime.parse(aTime, dateTimeFormatter);

        
    }
}
