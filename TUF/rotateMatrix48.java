public class rotateMatrix48 {
    public void Solution(int [][]matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int p1=0;
            int p2=n-1;
            while(p1<p2){
                int temp = matrix[i][p1];
                matrix[i][p1] = matrix[i][p2];
                matrix[i][p2] = temp;
                p1++;
                p2--;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix48 obj = new rotateMatrix48();
        obj.Solution(arr);
        for(int [] row : arr){
            for(int print : row){
                System.out.print(print + " ");
            }
            System.out.println();
        }
            
    }
  
}
