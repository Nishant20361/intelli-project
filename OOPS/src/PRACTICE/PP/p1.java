package PRACTICE.PP;

class  Employee{
    int salary;
    String name;
     int getSalary(){
        return salary;
    }
     String getName(){
        return name;
    }
     void  Setname(String n){
name =n;
    }
}
public class p1 {
    public static void main(String[] args) {
        Employee n=new Employee();
        n.Setname("nishant");
        n.salary=2222;
        System.out.println(n.getName());
        System.out.println(n.getSalary());
    }
}
