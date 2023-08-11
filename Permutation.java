public class Permutation {
    public static void main(String[] args) {
        
        String str = "ABC";

        permutation(str, "");

    }

    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String fp = str.substring(0, i);
            String sp = str.substring(i + 1);
            String rem = fp + sp;

            permutation(rem, ans + ch);
        }
    }
}
