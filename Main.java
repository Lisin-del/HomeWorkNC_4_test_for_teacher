package decorator;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5 ,6}, {7, 8, 9}};

        Matrix matrixImpl = new MatrixImpl(mat);
        System.out.println(matrixImpl.getElement(1, 1));

        Matrix transparentMatrix = new TransparentMatrix(new MatrixImpl(mat));
        System.out.println(transparentMatrix.getElement(2, 2));

        Matrix sumMatrices = new SumOfTwoMatrices(new TransparentMatrix(new MatrixImpl(mat)), matrixImpl);
        System.out.println(sumMatrices.getElement(1,1));


        
    }
}
