package Jerry.test1;

import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double cost=0.0;
        if(weight<20){
            cost = 5;
        }
        else if(weight>=20&&weight<=100){
            cost = 5+(weight-20)*0.2;
        }
        else if(weight>100){
            cost = 5+(weight-100)*0.15+80*0.2;
        }
        System.out.println(cost);
    }
}
