public class Person {
    String name,gender;
    int age;
    static boolean isHuman,hasNose,hasWings;
    static int numberOfHead,numberOfEyes;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
static {
        isHuman=true;
        hasNose=true;
        hasWings=true;
        numberOfHead=1;
        numberOfEyes=2;
}
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void sleep(){
        System.out.println(name+" is sleeping ");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}' +" isHuman= "+isHuman+" hasNose "+hasNose+" hasWings "+hasWings+" numberOfHead "+numberOfHead+" numberOfEyes "+numberOfEyes;
    }

    //    Create a class named Person:
//
//    Attributes:
//    instance: name, age, gender
//
//    static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
//
//    Add a constructor that can set All the fields (instances)
//
//
//    Actions:
//    eat(String food)
//    drink(String drink)
//    sleep()
//    toString()


}
