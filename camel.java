public class camel {
    public static void main(String[] args) {
        String str = "Hello in the world of java";

        String ans = Camelcase(str);

        System.out.println(ans);
    }

    public static String Camelcase(String str){

        if(str.length()==0){
            return "";
        }else if (str.length()==1){
            return str;
        }
        String ans = "";
        String[] arr = str.split(" ");

        String firstWord=arr[0];
        char fc  =  firstWord.charAt(0);

        if(fc>='A' && fc<='Z'){
            fc=(char)(fc-'A'+'a');
            firstWord=fc+firstWord.substring(1);
        }

        ans+=firstWord;

        for(int i=1;i<arr.length;i++){
            String temp = arr[i];
            char ch = temp.charAt(0);

            if(ch>='a' && ch<='z'){
            ch=(char)(ch-'a'+'A');
            temp = ch + temp.substring(1);
             }

        ans+=temp;
        }

        return ans ;
    }

    }
