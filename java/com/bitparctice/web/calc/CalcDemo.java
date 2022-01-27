package com.bitparctice.web.calc;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.calc
 * fileName        : CalcDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class CalcDemo {

    public String execute(int num1,int num2,String op) {

        CalcApp calcApp = new CalcApp();

        return calcApp.calc(num1, num2, op);
    }
}