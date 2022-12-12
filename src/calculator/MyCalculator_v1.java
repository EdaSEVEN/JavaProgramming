package calculator;

public class MyCalculator_v1 {
    public int a,b;

    public MyCalculator_v1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int plus(){
        return(a+b);
    }
    public int minus(){
        return(a-b);
    }
    public int multiply(){
        return(a*b);
    }
    public int divide(){
        return(a/b);
    }
}
