package Jerry.test1;

import java.util.Scanner;

public class pro4 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数：");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("请选择对这两个数进行的操作：（1.+ 2.- 3.* 4./）");
        int cz = scan.nextInt();
        int result=0;
        switch (cz){
            case 1:result=num1+num2;break;
            case 2:result=num1-num2;break;
            case 3:result=num1*num2;break;
            case 4:result=num1/num2;break;
            default:
                System.out.println("输入有误");
        }
        System.out.println("结果是："+result);
    }

}
