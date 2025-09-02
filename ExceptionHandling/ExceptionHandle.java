package ExceptionHandling;

import java.util.Scanner;


public class ExceptionHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<18){
            throw new RuntimeException("you can't vote!!");
        }else{
            System.out.println("you can vote!");
        }
    }
}
