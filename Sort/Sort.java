
/**
 * Write a description of class Sort here.
 *
 * @author Kameko Yamanaka
 * @version 1.25.18
 */

public class Sort
{
    int[] array = {23, 12, 3, 9, 4, 7, 41, 45, 2, 12, 1};
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
    }

    public void selectionSort(){
    }
}
