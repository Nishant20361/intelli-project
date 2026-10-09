package classwork2025;

import sport.Sport;
import student.test;

public class result extends test implements Sport {
    public void calculateTotal() {
        int totalmarks = mark1 + mark2 ;
        int totalscore= score1 + score2;
        System.out.println("total marks "+totalmarks);
        System.out.println("total score "+totalscore);
    }


    public static void main(String[] args) {
        result r=new result();
        r.inputDetail();
        r.input();
        r.display();
        r.calculateTotal();
    }
}