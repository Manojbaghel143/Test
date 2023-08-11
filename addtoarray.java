import java.util.Arrays;

public class addtoarray {
    public static void main(String[] args) {
        int [] arr1= {1,3,4,67,9};
        int [] arr2= {2,5,6,7,8};

       int [] rem = new int [arr1.length + arr2.length];

       for(int i=0; i<arr1.length; i++){
            rem[i] = arr1[i];
       }
       for(int i=0; i<arr2.length; i++){
        rem[i+arr1.length] = arr2[i];
       }
       System.out.println(Arrays.toString(rem));


    }
}
