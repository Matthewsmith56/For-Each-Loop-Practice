/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachloop;

/**
 *
 * @author Matthew
 */
public class ForEachLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = new int [11];
        for (int i = 1; i <= 10; i++)
        {
            myArray[i] = i;
        }
        for (int i : myArray)
        {
            System.out.print(" My Array Number "+i+", ");
        }
    }
    
}
