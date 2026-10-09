package classwork2025;
class vehicle{
    String model;
    int year;
    vehicle( String model,int year){
        this.model=model;
        this.year=year;
    }
    void vehicleDisplay(){
        System.out.println("The model of the vehicle "+model);
        System.out.println("the year of the vehicle "+year);
    }
}
class car extends vehicle{
    int carId;
    int price;
    car(String model,int year, int carId,int price){
        super( model, year);
        this.carId=carId;
        this.price=price;
    }
    void carDisplay(){
        System.out.println("The car id is "+carId);
        System.out.println("The price of the car "+price);
    }
}
public class Q6 {
    public static void main(String[] args) {
        car c=new car("Scorpio n",2021,31,2000032);
        c.vehicleDisplay();
        c.carDisplay();
    }
}
