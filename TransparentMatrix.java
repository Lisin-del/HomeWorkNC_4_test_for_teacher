package decorator;

public class TransparentMatrix extends AbstractMatrixOperation {

    public TransparentMatrix(Matrix matrix) {
        super(matrix);
    }

    @Override
    public int getElement(int i, int j) {
        return super.getElement(j, i);
    }
}


