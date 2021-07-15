package decorator;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoMatricesTest {
    @Test
    public void sumTest() {
        int[][] mat = {{1, 2, 3}, {4, 5 ,6}, {7, 8, 9}};
        SumOfTwoMatrices sumOfTwo = new SumOfTwoMatrices((new TransparentMatrix(new MatrixImpl(mat))), new MatrixImpl(mat));
        Assert.assertEquals(14, sumOfTwo.getElement(2,1));
    }
}
