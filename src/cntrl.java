import calculator.MyCalculator_v1;
import calculator.MyCalculator_v2;

public class cntrl {
    public static void main(String[] args) {
        System.out.println("calculator.MyCalculator_v2.plus(2,3) = " + MyCalculator_v2.plus(2, 3));
        System.out.println("calculator.MyCalculator_v2.multiply(5,6) = " + MyCalculator_v2.multiply(5, 6));
        System.out.println("calculator.MyCalculator_v2.divide(9,3) = " + MyCalculator_v2.divide(9, 3));
        MyCalculator_v1 a=new MyCalculator_v1(4,6);
        System.out.println(a.plus());
        System.out.println(a.divide());
        
    }
}
