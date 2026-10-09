package homework;
import java.util.Scanner;
class  student{
    String name;
    int roll,dsaMark;
    void getData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the roll no");
        roll= sc.nextInt();
        System.out.println("Enter the name");
        name= sc.next();
        System.out.println("Enter the Dsa marks");
        dsaMark= sc.nextInt();
    }
    void showData(){
        System.out.println("roll "+roll);
        System.out.println("Name "+name);
        System.out.println("DsaMarks "+dsaMark);
    }
}
public class Q11 {
    public static void main(String[] args) {
        student []s=new student[5];
        for (int i = 0; i < 5; i++) {
            s[i]=new student();
            System.out.println("Enter the detail of the student "+(i+1));
            s[i].getData();
        }
       int hMarks =s[0].dsaMark;
        for (int i = 0; i < 5; i++) {
            if (s[i].dsaMark>hMarks){
                hMarks=s[i].dsaMark;
            }
        }
        System.out.println("Student got highest marks");
        for (int i = 0; i < 5; i++) {
            if (s[i].dsaMark==hMarks){
                s[i].showData();
            }
        }
    }
}
