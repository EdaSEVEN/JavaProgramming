public class MyClass {
    public  int count;
    public void mymethod(MyClass ref)
    {
        ref.count++;

    }

}
class test {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.count=1;
        myClass.mymethod(myClass);
        System.out.println("myClass.count = " + myClass.count);
    }
}
