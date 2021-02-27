package App;

public class ArrayMaker {
    public int[] getArray() {
        int[] array = new int[15];
        NumberGenerator generator = new NumberGenerator();
        for(int i=0; i < array.length; i++) {
            array[i] = generator.numb_rnd();
        }
        return array;
    }
}
