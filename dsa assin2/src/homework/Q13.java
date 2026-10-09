package homework;
class  Bank{
   private String bankName; private int depositAmount;
    static int totalAmount=0;
    void setBankName(String name){
        bankName=name;
    }
    void setDepositAmount(int amount){
        if (amount>=1000) {
            depositAmount = amount;
            totalAmount += amount;
        }else {
            System.out.println("minimum amount 1000");

        }
    }
    void showData(){
        System.out.println("Bank name "+bankName);
        System.out.println("Amount "+depositAmount);
    }
    int getDepositAmount(){
        return depositAmount;
    }
    String getBankName(){
        return bankName;
    }
}
public class Q13 {
    public static void main(String[] args) {
        Bank [] b=new Bank[5];
        String [] bankNames={"SBI","ICICI","BOI","HDFC","AXIX"};
        int [] depositAmounts = {1500, 2500, 1000, 3000, 1800};

        for (int i = 0; i < 5; i++) {
            b[i]=new Bank();
            b[i].setBankName(bankNames[i]);
            b[i].setDepositAmount(depositAmounts[i]);
        }
        System.out.println("BANK DEPOSIT DETAILS");
        for (int i = 0; i < 5; i++) {
            b[i].showData();
            System.out.println("..............................");
        }
        System.out.println("Total amount "+Bank.totalAmount);
        int min=b[0].getDepositAmount();
        String minBank=b[0].getBankName();
        for (int i = 0; i < 5; i++) {
            if (b[i].getDepositAmount() < min) {
                min = b[i].getDepositAmount();
                minBank = b[i].getBankName();
            }
        }
        System.out.println("***************************************");
        System.out.println("The minimum deposited bank "+minBank+" amount "+min);
    }
}
