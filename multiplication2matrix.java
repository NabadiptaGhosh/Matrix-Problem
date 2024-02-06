public class multiplication2matrix {
    public static void main(String[] args) {
        int A[][]={{1,2,3}, {4,5,6}, {7,8,9}};  // it is our 3X3 matrix
        int B[][]={{1,2},{3,4},{5,6}}; // it is our 3X2 matrix

        

        // length of A's row and col
        int n1= A.length;
        int m1=A[0].length;
        // length of B's row and col
        int n2= B.length;
        int m2= B[0].length;

        // creat a new array whose row will be same as A's row and col will be same as B's col
        int newarr [][]= new int[n1][m2];

        // at first we have to check A's col and B's row is equal or not. If equal then multiplication is posiible otherwise not
        if(m1==n2){
            // for multiplication we want A's row & B's col so traversing A's row
            for(int i=0; i<n1; i++){
                // traverse B's col
                for(int j=0; j<m2; j++){
                    int sum=0;
                    //here we have to use another for loop beacuse we want A's 1st row's all value and B's 1st col's all value 
                    for(int k=0; k<m1; k++){ // we know that m1==n2 so here we have to go from k= 0 to k<m1 or n2 
                        sum+=A[i][k]*B[k][j];
                        

                    }
                    newarr[i][j]=sum;
                }
            }
        }
        //display newarr
        for(int a=0; a<n1; a++){
            for(int b=0; b<m2; b++){
                System.out.print(newarr[a][b]+" ");
            }
            System.out.println();
        }




//  A=[[1 2 3],[4,5,6]]   B=[[10,11],[13,14],[15,16]]
// 1*10+2*13+3*15 




    }
    
}
