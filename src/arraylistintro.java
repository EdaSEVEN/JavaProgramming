import java.util.ArrayList;

public class arraylistintro {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println("numbers = " + numbers);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(0,100);
        System.out.println("numbers = " + numbers);
    }
}
