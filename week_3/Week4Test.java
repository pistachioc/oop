import org.junit.Test;

import static org.junit.Assert.*;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(4, Week4.max2Int(4, 3));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(5, Week4.max2Int(4, 5));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(6, Week4.max2Int(6, 6));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(7, Week4.max2Int(7, -6));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(8, Week4.max2Int(8, 9));
    }

    @Test
    public void testMinArray1() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int[] arr = {9, 2, 3, 4, 5};
        assertEquals(2, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int[] arr = {1, 2, -3, 4, 5};
        assertEquals(-3, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int[] arr = {9, 9, 9, 9, 9};
        assertEquals(9, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int[] arr = {1, -1, -1, -1, -1};
        assertEquals(-1, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.7));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", Week4.calculateBMI(70, 1.7));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Béo phì", Week4.calculateBMI(80, 1.7));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Béo phì", Week4.calculateBMI(90, 1.7));
    }
} 