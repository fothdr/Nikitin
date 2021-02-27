package App;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubTest {

	@Test
	public void test() {
		boolean check = false;
		int number = App.NumberGenerator.numb_rnd();
		if (number <= 700 && number >= 500) { check = true; }
		assertTrue(check);
	}
	
    @BeforeClass
    public static void checkLength() {
        App.ArrayMaker arrayMaker = new App.ArrayMaker();
        int[] checkArray = arrayMaker.getArray();
        int[] resultArray = new int[15];
        assertEquals(checkArray.length, resultArray.length);
    }

    @BeforeClass
    public static void CheckNull() {
        App.ArrayMaker arrayMaker = new App.ArrayMaker();
        int[] checkArray = arrayMaker.getArray();
        for(int i=0; i < checkArray.length; i++) {
            assertNotNull(("Нулевой элемент: " + i), checkArray[i]);
        }
    }
    @BeforeClass
    public static void 
      sortCheckFirst() {
          int [] array = { 2, 1, 4, 6, 3, 5 };
          int [] sortedArray = { 1, 2, 3, 4, 5, 6 };
          App.SortArray sortArray = new App.SortArray();
          array = sortArray.sortArray(array);

          assertArrayEquals(array, sortedArray);
    }

    @AfterClass
    public static void 
      sortCheckSecond() {
          int [] array = { 2, 1, 4, 6, 3, 5 };
          int [] sortedArray = { 1, 2, 3, 4, 5, 6 };
          App.SortArray sortArray = new App.SortArray();
          array = sortArray.sortArray(array);

          assertArrayEquals(array, sortedArray);
    }
}