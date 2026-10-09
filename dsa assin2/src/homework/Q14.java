package homework;
class  Distance{
    int inch;
    int feet;
    Distance(int feet,int inch){
        this.feet=feet;
        this.inch=inch;
    }
    void display(){
        System.out.println("Feet "+feet+" inch "+inch);
    }
}
class measurement extends Distance{
    double cm;
    measurement(int feet, int inch,double cm){
        super(feet,inch);
        this.cm=cm;
    }

    @Override
    void display() {
        super.display();
        System.out.println("The centimetre is "+cm);
    }
}
public class Q14 {
    public static void main(String[] args) {
        measurement m=new measurement(23,23,12);
        m.display();
    }
}
