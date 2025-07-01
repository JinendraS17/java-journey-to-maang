import javax.swing.plaf.synth.SynthTextAreaUI;

public class Strings {
    public static void main(String[] args){
        String name = "Test";

        //print
        System.out.println(name);

        //know data type
        System.out.println("data type :" + name.getClass());

        //length of string
        System.out.println("length : " + name.length());

        //access first char
        System.out.println("1st of test : " + name.charAt(0));
        System.out.println("2nd of test : " + name.charAt(1));
        System.out.println("3rd of test : " + name.charAt(2));
        System.out.println("4th of test : " + name.charAt(3));

        //start
        int start = 0;
        //end
        int end = name.length();
        System.out.println(end);

        System.out.println("substring : " + name.substring(start, end)); // (0. 4) means strat from 0 till 3 4 is not included

        //string concatenation +
        System.out.println("string 1" + " " + "string 2"); // string 1 string 2

        // find index of e
        System.out.println("index of e in test" + name.indexOf('e'));

        //find last index
        System.out.println("last index is : " + name.lastIndexOf('e') );

        // Returns true if substring exists	"hello".contains("ell")
        System.out.println("test contain es: " + name.contains("es"));

        String name2 = "test";

        //equal
        System.out.println(name.equals(name2)); // false due to case
        System.out.println(name.equalsIgnoreCase(name2)); // true ignore case

        //covert string to char array
        char[] arrSting = name.toCharArray();

        System.out.println(arrSting);

        int value = 100;
        //convert primitive data type to string
        System.out.println(String.valueOf(value));
    }
}
