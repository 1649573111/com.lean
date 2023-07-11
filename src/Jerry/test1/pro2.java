package Jerry.test1;

import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i] = scan.nextInt();
        }
        int p =arr[0];
        for(int j=1;j<3;j++){
            if(p<arr[j]){
                p=arr[j];
            }
        }
        System.out.println(p);



    }
}
