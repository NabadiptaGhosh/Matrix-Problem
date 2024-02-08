//from line no 4 to line no 25 we do transpose 

public class rotate90degreeanticlockwise {
    
    //creat a "swap" method for use in "tranpose" method
    public static void swap1(int[][] matrix,int i, int j){
        
        int a=j;
        int b=i;
        //int c=0;
        //int d=0;
        int temp=0;
        temp=matrix[i][j];
        matrix[i][j]=matrix[a][b];
        matrix[a][b]=temp;
        return;
    }
    // creat a method for transpose 
    public static void transpose(int[][]matrix){
        int n=matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                swap1(matrix, i,j);
            }
        }

    }
    //craet method for swap i & j 
    public static void swap(int i, int j){
        int temp=0; 
        temp=i;
        i=j;
        j=temp;
        return;
    }
    // rotate method will be used for roate transpose matrix
    public static void rotate(int[][]matrix, int a, int b, int j){
        int temp=0;
        temp=matrix[a][j];
        matrix[a][j]=matrix[b][j];
        matrix[b][j]=temp;
        return;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n= matrix.length;
        transpose(matrix);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                swap(i,j);// 10=arr[0][1] i=0, j=1 but after swap i=1, j=0

                int a=0;
                int b=n-1;
                // [10,12,13] here normally 10=[0][0],12=[0][1],13=[0,2] after i & j swap our 10=[0][0],12=[1][0],13=[2][0] here we saw that at 1st our row was same but after swap our col is same. Now we want only the 1st row value and last row value where col is equal.
                // a is 1st row value and b is last row value
                
                while(a<=b){
                    //swap a and b
                    int temp=0;
                    temp=a;
                    a=b;
                    b=temp;
                    //use rotate method for rotate the transpose matrix
                    rotate(matrix, a, b, j);
                    a++;
                    b--;

                }
                

            }
            
        }
        //display  final matrix
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
