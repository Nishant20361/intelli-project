package classwork;
//import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        char [] a={'c','a','r','b','o','n'};
        int l=a.length;
        for (int i = 0; i <l ; i++) {
            for (int j = 0; j < l; j++) {
                if (i==j){
                    continue;
                }
                for (int k = 0; k < l; k++) {
                    if (k==i||k==j){
                        continue;
                    }
                    for (int m = 0; m < l; m++) {
                        if (m==i||m==j||m==k){
                            continue;
                        }
                        for (int n = 0; n < l; n++) {
                            if (n==i||n==j||n==k||n==m){
                                continue;
                            }
                            for (int o = 0; o < l; o++) {
                                if (o==i||o==j||o==k||o==m||o==n){
                                    continue;
                                }
                                System.out.println(" "+a[i]+a[j]+a[k]+a[m]+a[n]+a[o]);
                            }

                        }
                    }

                }
            }

        }
    }
}
