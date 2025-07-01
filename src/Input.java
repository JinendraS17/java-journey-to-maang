import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("please enter number 1: ");
        number1 = sc.nextInt();
        System.out.println("please enter number 2: ");
        number2 = sc.nextInt();

        System.out.println(number1);
        System.out.println(number2);

        //sc.next() used for string
        //sc.nextInt() used for int input
        //sc.nextFloat() used for float input
        //sc.nextBoolean() used for boolean input
        //sc.nextLine() used for string



    }
}
