package classwork2025;
import  java.util.Scanner;
 class book{
     int bookId,quantity;
     double price;
     static  double totalAmount;
     book(int bookId,int quantity,double price){
         this.bookId=bookId;
         this.price=price;
         this.quantity=quantity;
         totalAmount=totalAmount+(price*quantity);
     }
     void displayData(){
         System.out.println("The book id "+bookId);
         System.out.println("The quantity of the book "+quantity);
         System.out.println("The price of book "+price);
     }
 }

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        book[]a=new book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the detail of the book "+(i+1));
            System.out.println("Enter the bookId");
            int id= sc.nextInt();
            System.out.println("Enter the quantity");
            int q=sc.nextInt();
            System.out.println("Enter the price of the book");
            double p= sc.nextDouble();
            a[i]=new book(id,q,p);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Detail of the product "+(i+1));
            a[i].displayData();
        }
        System.out.println("Total amount of books "+book.totalAmount);
    }
}
