import java.awt.desktop.SystemEventListener;

public class Operators {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        // arithmetic Operator
        System.out.println("Add : " + (num1 + num2));
        System.out.println("Sub : " + (num2 - num1));
        System.out.println("Multi : " + (num2 * num1));
        System.out.println("Div : " + (num2/num1));
        System.out.println("Modulo : " + (num2 % num1));

        // unary Operator
        int num3 = -num1;
        int num4 = -num3;
        System.out.println(num3); // 10 to -10
        System.out.println(num4); // 10

        // unary -
        // -- = +
        // +- = -
        int num5 = +num3;
        System.out.println(num5); // -10

        // unary operator ++
        int num6 = 10;
        System.out.println("num6 = 10 ++num6" + ++num6); //++ before 1+num6
        System.out.println("num6 = 11" + num6++); // print first after increment num6 is 11 only
        System.out.println("num 6 " + num6); // here it will change to 12

        boolean num7 = true;
        System.out.println(!num7); // true to false

        // relational Operator
        int num8 = 10;
        int num9 = 20;

        System.out.println(num8 == num9); // false
        System.out.println(num8 != num9); // true
        System.out.println(num8 <= num9); // true
        System.out.println(num8 >= num9); // false
        System.out.println(num8 > num9); //  false
        System.out.println(num8 < num9); // true

        // logical operator
        // && only true && true are true other false
        // || only false && false are false other true

        // Assignment operator
        // num9 = num9 + value short form num9 += value
        // num9 = num9 - value short from num9 -= value
        // num9 = num9 * value short from num9 *= value
        // num9 = num9 / value short from num9 /= value
        // num9 = num9 % value short from num9 %= value

        //ternary operator
        // condition ? first : second
        // condition ? (condition ? first : second) : second;

    }
}
