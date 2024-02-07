import java.util.*;
public class sumofupperandlowertiangles {
    public static void main(String[] args){
        int[][] matrix= {{6,5,4},{1,2,5},{7,9,7}};
        int n= matrix.length;
        ArrayList<Integer> ans = new ArrayList<>();
        //upper triangle
        int sum1=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum1+=matrix[i][j];
            }
        }
        
        //lower triangle
        int sum2=0;
        for(int i=n-1; i>=0; i--){
            for(int j=i; j>=0; j--){
                sum2+=matrix[i][j];
            }
        }
        ans.add(sum1);
        ans.add(sum2);
        // now display the "ans"arraylist
        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        


    }
    
}
