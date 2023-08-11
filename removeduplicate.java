import java.util.ArrayList;

public class removeduplicate {
    public static void main(String[] args) {
        
        int [] arr = {1,2,2,2,2,3,4,5,5,5,5};

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
           int ele = arr[i];
 
           boolean flag = false;
 
           for(int j =0;j<res.size();j++){  
             int listElement = res.get(j);
 
              if(listElement==ele){  
                 flag=true;
                 break;
              }
           }
 
           if(flag == false){  
             res.add(ele);
           }
        }
 
        System.out.println(res);
 
    }
}
