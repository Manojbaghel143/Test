public class Togglecase {
    public static void main(String[] args) {
         String str = "JaVa Is World TopPeSt LenGUAge";

         String ans = "";

         for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
 
             if(ch>='a' && ch<='z'){
                 ch = (char)(ch-'a'+'A');
             }else if(ch>='A' && ch<='Z'){
                ch = (char)(ch-'A'+'a');
             }
 
             ans+=ch;
         }
 
         System.out.println(ans);
    }
}
