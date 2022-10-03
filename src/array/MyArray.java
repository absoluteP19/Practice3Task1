package array;
import java.util.Random;
public class MyArray {

    private float array[] = new float[10];
    private int size = 10;


    public void createRandom(){
        Random random = new Random();
        for(int i = 0; i < size; i++){
            array[i] = random.nextFloat();
        }
    }
    public void createMathRandom(){
        for(int i = 0; i < size; i++){
            array[i] = (float) Math.random();
        }
    }
    public void print(){
        System.out.println("------------");
        for(int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }

    public void sort(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - 1; j++){
                if(array[j] > array[j + 1]){
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }else{
                    continue;
                }

            }
        }
    }


}
