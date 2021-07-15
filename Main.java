package decorator;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5 ,6}, {7, 8, 9}};

        Matrix matrixImpl = new MatrixImpl(mat);
        Matrix transparentMatrix = new TransparentMatrix(new MatrixImpl(mat));
        Matrix sumMatrices = new SumOfTwoMatrices(new TransparentMatrix(new MatrixImpl(mat)), new MatrixImpl(mat));

        System.out.println("## Simple matrix");
        for(int i = 0; i < 3; ++i) {
            System.out.print("|");
            for(int j = 0; j < 3; ++j) {
                System.out.printf("%d ", matrixImpl.getElement(i, j));
            }
            System.out.println("|");
        }
        
        System.out.println("## Transparent matrix");
        for(int i = 0; i < 3; ++i) {
            System.out.print("|");
            for(int j = 0; j < 3; ++j) {
                System.out.printf("%d ", transparentMatrix.getElement(i, j));
            }
            System.out.println("|");
        }

        System.out.println("## Sum of two matrices");
        for(int i = 0; i < 3; ++i) {
            System.out.print("|");
            for(int j = 0; j < 3; ++j) {
                System.out.printf("%d ", sumMatrices.getElement(i, j));
            }
            System.out.println("|");
        }
    }
}
