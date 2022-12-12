package square;

public class Square {

    private double side;

    public double getSide() {

        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.out.println("error");
            return;
        }
        this.side = side;
    }
    public Square(double side) {
        setSide(side);
    }
     public double calcArea(){
        return Math.pow(side,2);

     }
    public double calcperimeter(){
        return side*4;

    }
    public String toString() {
        return "side= " + side +" area= " + calcArea() +" perimeter= " + calcperimeter() ;
    }

}
