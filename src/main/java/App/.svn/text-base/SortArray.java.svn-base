package App;
import java.util.Arrays;

public class SortArray {
	public int[] sortArray(int [] array) {
		 
		 
        boolean isSorted = false;
        int trnsf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
 
                    trnsf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = trnsf;
                }
            }
        }
        
        return array;
       
    }
}
