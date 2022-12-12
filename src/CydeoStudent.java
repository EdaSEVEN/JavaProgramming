public class CydeoStudent {
    public String name,gender,grade;
    public int age,id,batchNumber, groupNumber;
    public static String schoolName, programmingLanguage;

    public CydeoStudent(String name) {
        this.name = name;
    }

    public CydeoStudent(String name, String gender) {
        this(name);
        this.gender = gender;
    }

    public CydeoStudent(String name, String gender, String grade) {
        this(name, gender);
        this.grade = grade;
    }
    static {
        schoolName="cydeo";
        programmingLanguage="java";

    }
    public void study (String lesson1){
        System.out.print(name+" is studying "+ lesson1);
    }
    public void study (String lesson1,String lesson2){
        System.out.print(name+" is studying "+ lesson1+ " and "+ lesson2);
    }


    public static class anagram{
    public static void main(String[]args) {
            String a="silenta";
            String b="listeni";
            System.out.println(anagram(a,b));
            }
            public static boolean anagram(String str1,String str2){
                    if(str1.length()==str2.length()){
                            int count=0;
                            for (int i=0;i<str1.length();i++){

                                    for (int j=0;j<str2.length();j++){
                                         if (str1.charAt(i)==str2.charAt(j)){
                                           count++;
                                         }

                                    }
                            }
                            if (count==str1.length())
                                    return true;
                            else
                                    return false;
                    }
                    else
                            return false;
            }
    }
}