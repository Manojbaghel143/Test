import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        boolean flag = true;

        for(int i=2; i<n; i++){
            if(n%i==0){
                flag = false;
            }
        }
        if(flag==true){
            System.out.println("This is A Prime Number");
        }else{
            System.out.println("This is Not Prime Number");
        }
        
    }
}
