public class wrapperclass {
    public static void main(String[] args) {

//        int a=2;
//        Integer b=122;
//        Integer c=new Integer(12);
//        String number1="100";
//        String number2="200";
//        String result=number1+number2;
//        System.out.println("result = " + result);
//        int result1=Integer.parseInt(number1);
//        int result2=Integer.parseInt(number2);
        String str = "Wooden Spoon876!";
        String letters="",digits="",specialChars="";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters += c;

            } else if (Character.isDigit(c)) {
                digits += c;
            } else if (!Character.isLetterOrDigit(c)) {
                specialChars += c;
            }

        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

    }


}
