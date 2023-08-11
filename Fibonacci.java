import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ft=0;
        int st=1;

        for(int i=0; i<n; i++){
            int tt=ft+st;

            System.out.println(ft);
            ft=st;
            st=tt;
        }
        
    }
}