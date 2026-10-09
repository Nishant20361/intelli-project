package homework;
public  class ppr {
    public static void main(String[] args) {
        String name = "nishant";
        int count = name.length();
        String rev = "";
        for (int i = count - 1; i >= 0; i--){
            rev += name.charAt(i);
    }
        System.out.println(rev);
    }
}