import java.util.Arrays;

class DiagonalMatrix {
    public static void main(String[] args)
    {

        int[][] matrix = new int[4][4];


        for (int i = 0; i < matrix.length; i++) {
           // matrix[i][2] = n;
            for (int j = 0; j < matrix[i].length; j++) {
             //   System.out.print(matrix[i][j] + " ");
                if (i == j) {
                    System.out.print(1 +" ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
} 