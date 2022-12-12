import java.util.Arrays;

public class Arrayreverse {
    public static void main(String[] args) {
       int[][] array = { {1,2,3}, {4,5,6,7}};
       int [][] array1=new int[array.length][];

       for (int i=array.length-1,k=0;i>=0;i--,k++){
           array1[k]=new int[array[i].length];
           for (int j=array[i].length-1,l=0;j>=0;j--,l++)
           {
               array1[k][l]=array[i][j];
           }

       }
        System.out.println(Arrays.deepToString(array1));
    }
}