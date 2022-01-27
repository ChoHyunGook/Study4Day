package com.bitparctice.web.bmicalc;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web
 * fileName        : BmiCalcDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : BMI 지수 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class BmiCalcDemo {
    public String execute(String name,double inch,int height){
        BmiCalcAPP bmiCalcAPP= new BmiCalcAPP();
        return bmiCalcAPP.bmicalc(height,inch,name);



    }
}
