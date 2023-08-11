import java.nio.file.Path;

public class MazePath {
    public static void main(String[] args) {
        
        int sr=0;
        int sc=0;
        int dr=2;
        int dc=2;

         MazePath(sr, sc, dr, dc, " ");
   
    }
    public static void MazePath(int sr, int sc, int dr, int dc, String Path){
       if(sr>dr || sc>dc){
        return;
       }
        else if(sr==dr && sc==dc){
            System.out.println(Path);
            return;
        }
        MazePath(sr, sc+1, dr, dc, Path+"H");
        MazePath(sr+1, sc, dr, dc, Path+"V");
    }
}
