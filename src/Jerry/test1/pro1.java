package Jerry.test1;

import java.util.Scanner;

/**
 * @author 彭
 * 要求：年龄对应状态
 */
public class pro1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age<6){
            System.out.println("儿童");
        }
        else if(age>=6&&age<=13){
            System.out.println("少儿");
        }
        else if(age>=14&&age<=17){
            System.out.println("青少年");
        }
        else if(age>=18&&age<=35){
            System.out.println("青年");
        }
        else if(age>=35&&age<=50){
            System.out.println("中年");
        }
        else if(age>=35&&age<=50){
            System.out.println("中老年");
        }
        else if(age>50){
            System.out.println("老年");
        }



    }
}
