package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        Assert.assertEquals(5, Week3.max(2, 5));
        Assert.assertEquals(90, Week3.max(90, 56));
        Assert.assertEquals(0, Week3.max(0, -57));
        Assert.assertEquals(77, Week3.max(-77, 77));
        Assert.assertEquals(65, Week3.max(56, 65));
    }


    //  Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {
        Assert.assertEquals(-9, Week3.minOfArray(new int[]{3, 5, 99, 0, 22, 56, -9, 33, 0, -7, 32}));
        Assert.assertEquals(-248, Week3.minOfArray(new int[]{-177, 244, 29, 123, 224, -248, -94, -102, 186, 156, -160, -238, 0}));
        Assert.assertEquals(-188, Week3.minOfArray(new int[]{85, -188, -23, 148, 111, -57, 144, 152, 195, -150, -72, 73, -21, 11}));
        Assert.assertEquals(-189, Week3.minOfArray(new int[]{104, 138, 154, -189, 111, 92, -36, -143, -141, -32}));
        Assert.assertEquals(-245, Week3.minOfArray(new int[]{130, 229, -8, 160, 237, 44, -134, -79, 16, -224, -220, 19, 133, -231, -7, -100, -53, -126, 160, -245, 31, 18}));
    }

    // Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI() {
        Assert.assertEquals("Thiếu cân", Week3.calculateBMI(45.5, 1.8));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(84, 1.6));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(61, 1.7));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(88, 1.6));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(93, 1.9));
    }
}
