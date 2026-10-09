package homework;
class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class employee extends person{
    int eid;
    int salary;
    employee(String name,int age,int eid,int salary){
        super(name,age);
        this.eid=eid;
        this.salary=salary;
    }
    void emfDisplay(){
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("Eid " + eid);
        System.out.println("salary " + salary);
    }
}
public class Q12 {
    public static void main(String[] args) {
        employee e= new employee("Sahil",25,321,55000);
        e.emfDisplay();
    }
}
