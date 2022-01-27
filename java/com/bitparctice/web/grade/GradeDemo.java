package com.bitparctice.web.grade;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.grade
 * fileName        : GradeDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            : 성적표 출력 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class GradeDemo {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        for (int i=2;i<3; i++){
            System.out.println(i+"번학생 국어 영어 수학 점수를 순서대로 입력하세요.");
            String name = scanner.next();
            int kor = scanner.nextInt();
            int eng = scanner.nextInt();
            int math = scanner.nextInt();
            String res = gradeApp.grade(name,kor,eng,math);
            System.out.println(res);
        }
    }
}
