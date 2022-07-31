package com.company;

import java.time.LocalDateTime;

public class Main {


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int monthYear=now.getMonthValue();
        int dayMonth = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second= now.getSecond();

        System.out.println(dayMonth+" / "+monthYear+" / "+year);
        System.out.println(hour+" : "+minute+" : "+second);
    }
}