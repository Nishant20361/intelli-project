package classwork2025;
import java.util.*;
class cardetail{
    String model;
    int year;
    void setDetail(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the model");
         model= sc.next();
        System.out.println("Enter the year");
         year= sc.nextInt();
    }
    void displayDetail() {
        System.out.println("The model is " + model + " the year is " + year);
    }
}
public class Q1 {
    public static void main(String[] args) {
        cardetail c1=new cardetail();
        cardetail c2= new cardetail();
        c1.model= "maruti";
        c1.year=1992;
        c2.setDetail();
        c2.displayDetail();
        c1.displayDetail();
        if (c1.year>c2.year){
            System.out.println(c1.model+" is newest car");
        }
        else {
            System.out.println(c2.model+" is newest car");
        }
    }
}
