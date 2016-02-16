
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import static java.util.Arrays.sort;

/**
 *
 * @author vnaidu
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {10, 3, 2, 14, 22, 33, 12, 4, 5};
        PrintArray(array);
        sort(array);
        PrintArray(array);
    }

    public static void PrintArray(int[] array) {
        String arrayStr = "";
        for (int i = 0; i < array.length; i++) {
            arrayStr = arrayStr + array[i] + " ";
        }
        System.out.println(arrayStr);
    }

    
    public static void SelectionSort(int[] array)
    {
        for (int j = 0; j < array.length - 1; j++) 
        {
            int smallestIndex = j;
            for(int i = j; i<array.length ; i++ ){
                if(array[smallestIndex]>array[i])
                    smallestIndex = i;
            }
                
            int temp = array[smallestIndex];
            array[smallestIndex] = array[j];
            array[j] = temp;
        }
    }
    
    
    public static void BubbleSort(int[] array) {

        //need another for loop to repeat pass thru 
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = 0;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

}
