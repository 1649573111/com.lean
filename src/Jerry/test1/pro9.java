package Jerry.test1;

import java.util.Scanner;

public class pro9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int chen=1;
        for(int i=1;i<=num;i++){
            chen*=i;
        }
        System.out.println(chen);
    }
}
