public class phoneObject {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone();
        IPhone iPhone2=new IPhone();
        IPhone iPhone3=new IPhone();
        IPhone iPhone4=new IPhone();

        iPhone.brand="Iphone";
        iPhone.setInfo("iphone","xyz12","darkblue",6000,'L');
        iPhone2.setInfo("iphone1","xyz12","darkblue",6000,'L');
        iPhone3.setInfo("iphone2","xyz13","darkblue",6000,'L');
        iPhone4.setInfo("iphone3","xyz14","darkblue",6000,'L');
        IPhone[]phones={iPhone,iPhone2,iPhone3,iPhone4};
        for (IPhone each:phones) {
            if (!(each.model.equals("xyz12")))
                System.out.println("each = " + each);
        }
        iPhone.faceTime("abc@abc.com");
        System.out.println("iPhone.toString() = " + iPhone.toString());
    }
}
