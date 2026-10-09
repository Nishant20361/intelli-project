package PRACTICE.PP;
import java.util.Scanner;
class product {
    int prodId, quantity;
    double price;
    static double  totalPrice;

    product(int prodId, int quantity, double price) {
        this.prodId = prodId;
        this.quantity = quantity;
        this.price = price;
        totalPrice = totalPrice + (price * quantity);
    }

    void displaydata() {
        System.out.println("product id " + prodId);
        System.out.println("product quantity " + quantity);
        System.out.println("product price " + price);
    }
}
    public class aa {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            product [] p=new product[2];
            for (int i = 0; i < 2; i++) {
                System.out.println("enter  detail of product "+(i+1));
                System.out.println("enter the product id");
                int id = sc.nextInt();
                System.out.println("enter price");
                double pr= sc.nextDouble();
                System.out.println("enter the quantity");
                int q= sc.nextInt();
                p[i]=new product(id,q,pr);
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("detail of product "+(i+1));
                p[i].displaydata();
            }
            System.out.println("total billed "+product.totalPrice);
        }
    }
