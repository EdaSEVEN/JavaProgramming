public class phone {
    public String brand, model, color;
    public int  price;
    public char size;
    public void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling"  );
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting"  );
    }

    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public void setInfo(String brand, String model, String color, int price, char size) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;

            }
}
