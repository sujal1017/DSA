public class setMatrixZeros73 {
    public void Solution(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int [] row = new int [m];
        int [] col = new int [n];

        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }        
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,0},
            {1,0,2}
        };
        setMatrixZeros73 obj = new setMatrixZeros73();
        obj.Solution(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
