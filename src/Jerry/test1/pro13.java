package Jerry.test1;

import java.util.Scanner;

public class pro13 {
    public static void main(String[] args) {
       int ab=0;
       int cd=0;
       for(int i=1000;i<=9999;i++){
           ab=i/100;
           cd=i%100;
           if((ab+cd)*(ab+cd)==i){
               System.out.println(i);
           }
       }

    }
}
