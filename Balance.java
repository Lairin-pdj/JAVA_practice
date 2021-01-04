import java.util.Scanner;

public class Balance {
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
                    System.out.println("out of range.");
                    continue;
                }
            }
            catch(Exception e){
                System.out.println("is not a number.");
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
                            System.out.println("can't put negative.");
                            break;
                        }
                    }
                    catch(Exception e){
                        System.out.println("is not a number.");
                        sc.next();
                        break;
                    }
                    temp = inputBalance(num);
                    System.out.println("add " + temp);
                    break;
                case 3:
                    try{
                        System.out.print("OUTPUT : ");
                        num = sc.nextInt();
                        if(num > checkBalance()){
                            System.out.println("out of range.");
                            break;
                        }
                    }
                    catch(Exception e){
                        System.out.println("is not a number.");
                        sc.next();
                        break;
                    }
                    temp = outputBalance(num);
                    System.out.println("temp);
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
