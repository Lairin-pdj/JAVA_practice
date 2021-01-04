package com.company;
import java.util.Scanner;

public class Main {
    static int balance = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        boolean check = true;
        System.out.println("BALANCE SYSTEM");

        while(check) {
            System.out.println("\n\tMENU");
            System.out.println("1 : CHECK BALANCE");
            System.out.println("2 : INPUT BALANCE");
            System.out.println("3 : OUTPUT BALANCE");
            System.out.println("4 : EXIT");
            System.out.print(">> ");

            try{
                i = sc.nextInt();
            }
            catch(Exception e){
                System.out.println("숫자를 입력해 주세요.");
                i = -1;
            }
            if(i < 0 || i > 2){
                System.out.println("범위 밖의 숫자입니다.");
                continue;
            }

            switch(i) {
                case 1:
                    System.out.println("balance" + checkBalance());
                    break;
                case 2:
                    check = false;
                    break;
                default:
                    break;
            }
        }
    }
    public static int checkBalance(){
        return balance;
    }
    public static int inputBalance(int num){
        balance += num;
        return balance;
    }
    public static int outputBalance(int num){
        balance -= num;
        return balance;
    }
}