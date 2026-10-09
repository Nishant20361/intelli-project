package classwork2025;
class Employee{
    String name;
    int salary;
    Employee( String name,int salary){
       this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("name "+name);
        System.out.println("Salary "+salary);
    }
}
class manager extends Employee{
    String department;
    manager(String name,int salary,String department){
        super(name,salary);
        this.department=department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department "+department);
    }
}
public class Q9 {
    public static void main(String[] args) {
        manager e=new manager("Ronak",12000,"IT");
        e.display();
    }
}
