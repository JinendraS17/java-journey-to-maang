public class TypeCasting {
    public static void main(String[] args){
        int num1 = 10;
        float num2 = num1; //here type casting is implicit no data loss

        float num3 = 20.33F;
        int num4 = (int)num3; // here data loss there so java will give error we need to do manually by defining datatype
        System.out.println("num1 : " + num1 + " num2 : " + num2);
        System.out.println("num3 : " + num3 + " num4 : " + num4);

        //constants
        int num5 = 10;
        System.out.println("before : " + num5);
        num5 = 20;
        System.out.println("after : " + num5); // here value got changed

        // we can use final keyword
        final int num6 = 100;
        System.out.println("before : " + num6);
        //num6 = 20; // it will give error becuse of final keyword

    }
}
