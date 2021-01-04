package com.company;
import java.util.Scanner;

public class Main {
    static int balance = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num;
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
                if(i < 0 || i > 4){
                    System.out.println("범위 밖의 숫자입니다.");
                    continue;
                }
            }
            catch(Exception e){
                System.out.println("숫자를 입력해 주세요.");
                sc.next();
                continue;
            }

            int temp;
            switch(i) {
                case 1:
                    System.out.println("NOW BALANCE : " + checkBalance());
                    break;
                case 2:
                    try{
                        System.out.print("INPUT : ");
                        num = sc.nextInt();
                        if(num < 0){
                            System.out.println("음수는 넣을 수 없습니다.");
                            break;
                        }
                    }
                    catch(Exception e){
                        System.out.println("숫자가 아닙니다.");
                        sc.next();
                        break;
                    }
                    temp = inputBalance(num);
                    System.out.println(temp + "만큼 추가되었습니다.");
                    break;
                case 3:
                    try{
                        System.out.print("OUTPUT : ");
                        num = sc.nextInt();
                        if(num > checkBalance()){
                            System.out.println("허용 출력을 넘었습니다.");
                            break;
                        }
                    }
                    catch(Exception e){
                        System.out.println("숫자가 아닙니다.");
                        sc.next();
                        break;
                    }
                    temp = outputBalance(num);
                    System.out.println(temp + "만큼 차감되었습니다.");
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("GOOD BYE!");
    }
    public static int checkBalance(){
        return balance;
    }
    public static int inputBalance(int num){
        balance += num;
        return num;
    }
    public static int outputBalance(int num){
        balance -= num;
        return num;
    }
}