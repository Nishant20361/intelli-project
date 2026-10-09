import java.util.*;
public class assign_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
// 1:-
        System.out.println("Enter the  degree Fahrenheit:");
        double fahrenheit = sc.nextInt();
        double celsius = (fahrenheit-32) *((double) 5 /9);
        System.out.println(fahrenheit + " is " + celsius +" degree celsius");
        System.out.println("\n\n");

// 2:-

        System.out.println("Enter the kilometer");
         double kilometer = sc.nextInt();
         double meter=kilometer*1000;
         double feet=kilometer*3280.8399;
         double inch = kilometer*39370.0787;
         double centimeter = kilometer*100000;
        System.out.println(kilometer + " is " + meter + " meter");
        System.out.println(kilometer + " is " + feet + " feet");
        System.out.println(kilometer + " is " +  inch + " inch ");
        System.out.println(kilometer + " is " + centimeter+ "centimeter");
        System.out.println("\n\n");

//3:-

        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        double da = salary * 40/100;
        double hra = salary * 20/100;
        double gross_salary = salary + da + hra ;
        System.out.println("DA is "+da);
        System.out.println("HRA is "+hra);
        System.out.println("Gross salary is "+ gross_salary);
        System.out.println("\n\n");


//4:-
        System.out.println("Enter  three digit  number");
        int number = sc.nextInt();
        int sum=0;

        sum+=number%10; // extract last digit of a number
        number/=10; //remove the last digit
        sum+=number%10; // extract last digit of a number
        number/=10; //remove the last digit
        sum+=number%10; // extract last digit of a number

        System.out.println(" the sum of Three digit number is "+sum);
        System.out.println("\n\n");




//5

        System.out.println("Enter the radius of hemisphere");
        double radius = sc.nextDouble();
        double area = 3* Math.PI * radius * radius;
        double volume=(2.0/3.0) * Math.PI * radius * radius * radius;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
        System.out.println("\n\n");

//6:-

        System.out.println("Enter the number of seconds : ");
        double seconds = sc.nextDouble();
        double d= 0.5 * 32.174 * seconds*seconds;
        System.out.println("The distance travelled is "+d);
        System.out.println("\n\n");

//7:-
        System.out.print("Enter the first number   : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("a"+"\t" +"b"+ "\t"+"pow of a,b");
        System.out.println(a +"\t"+b + "\t" +Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+b + "\t" +Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+b + "\t" +Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+b + "\t" +Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t"+b + "\t" +Math.pow(a,b));
        System.out.println("\n\n");



//8

        System.out.println("Enter the number of minutes : ");
        int c = sc.nextInt();
        double total_days= ((double) c /(24*60));
        double year =total_days/365;
        double days =total_days%365;
        System.out.println("The year is "+year+" and days is "+days);


//9










    }
}
