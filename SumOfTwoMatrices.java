package decorator;

public class SumOfTwoMatrices extends AbstractMatrixOperation {
    private Matrix matrixImpl;

    public SumOfTwoMatrices(Matrix matrix, Matrix matrixImpl) {
        super(matrix);
        this.matrixImpl = matrixImpl;
    }

    @Override
    public int getElement(int i, int j) {
        return super.getElement(i, j) + matrixImpl.getElement(i, j);
    }

}
