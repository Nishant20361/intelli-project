package classwork2025;
interface flyable{

    }
    interface swimAble{

    }
     class Duck implements flyable , swimAble{
    String name;
    Duck(String name){
        this.name=name;
    }
    public void fly(){
        System.out.println(name+" is flying");
    }


         public void swim() {
             System.out.println(name+" is swimming");
         }
         void display(){
             System.out.println("Duck name "+name);
         }
     }
public class Q8 {
    public static void main(String[] args) {
        Duck d=new Duck("honey");
        d.display();
        d.fly();
        d.swim();
    }
}
