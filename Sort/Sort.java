
/**
 * Write a description of class Sort here.
 *
 * @author Kameko Yamanaka
 * @version 1.25.18
 */

public class Sort
{
    int[] array = {23, 12, 3, 9, 4, 7, 41, 45, 2, 15, 1};
    public Sort(){
        // public constructor to access array
    }

    public void bubbleSort(){
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array.length-1; y++){
                if(array[y] > array[y+1]){
                    int temp = array[y];
                    array[y] = array[y+1];
                    array[y+1] = temp;
                }
            }
        }
    }

    public void insertionSort(){
        for(int x = 0; x < array.length; x++){
            int temp = array[x];
            int i = x-1;
            while((i > -1) && (array[i] > temp)){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = temp;
        }
    }

    public void selectionSort(){
        for(int x = 0; x < array.length-1; x++){
            int temp = array[x]; // stores current index
            int min = x; // min index excluding sorted
            for(int y = x; y < array.length; y++){
                if(array[y] < array[min]){ 
                    temp = array[x];
                    min = y;
                }
            }
            array[x] = array[min];
            array[min] = temp;
        }
    }

}
