package decorator;

import org.junit.Assert;
import org.junit.Test;

public class TransparentMatrixTest {
    @Test
    public void getElementTransparentTest() {
        int[][] mat = {{1, 2, 3}, {4, 5 ,6}, {7, 8, 9}};
        Matrix transparentMatrix = new TransparentMatrix(new MatrixImpl(mat));
        Assert.assertEquals(8, transparentMatrix.getElement(1, 2));
    }
}
