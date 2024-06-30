package com.ohgiraffers.practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
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

        // HashMap은 데이터 구조 중 하나로, 키(key)와 값(value) 쌍으로 데이터를 저장하는 자료구조
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 삽입
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // 데이터 검색
        int value = map.get("banana"); // 2 출력
        System.out.println("banana: " + value);

        // 데이터 삭제
        map.remove("cherry");

        // HashMap의 모든 키와 값을 출력
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public void trainList(List<TrainDTO> trainList) {

        for (TrainDTO train : trainList) {

            // 시간 형식 바꾸는 방법 (HH:mm:ss -> HH:mm)

            LocalTime depTime = train.getDepTime();
            LocalTime arrivalTime = train.getArrivalTime();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

            String formattedTime = depTime.format(formatter);
            String formattedTime2 = arrivalTime.format(formatter);

            System.out.println("운행번호:" + train.getScNo()
                    + " 기차명:" + train.getTrainName() + " 출발지:" + train.getDeparture() + " 목적지:" + train.getArrival() +
                    " 출발시간-" + formattedTime + " 도착시간-" + formattedTime2);
        }
    }
}
