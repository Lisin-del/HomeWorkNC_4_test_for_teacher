package decorator;

public abstract class AbstractMatrixOperation implements Matrix {
    private Matrix matrix;

    public AbstractMatrixOperation(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement(int i, int j) {
        return matrix.getElement(i, j);
    }
}
