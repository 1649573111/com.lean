package Jerry.test1;

import java.util.Scanner;

public class pro6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        while (num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);


    }
}
