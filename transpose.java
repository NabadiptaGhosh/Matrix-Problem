public class transpose {
    // here we creat a method for swapping
    public static void swap(int[][] matrix,int i, int j){
        
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
    // main method
    public static void main(String[] args){
        int [][] matrix= {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int n=matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                swap(matrix, i,j);
            }
        }
        //display matrix[][]
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
           
        }
        

    }
    
}
