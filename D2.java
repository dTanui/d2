/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

/**
 *
 * @author GLORIA
 */
public class D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int value;
 String output = "";

 // loop 20 times
 for ( int counter = 1; counter <= 20; counter++ ) {

 // pick random integer between 1 and 6
 value = 1 + ( int ) ( Math.random() * 6 );

 output += value + " "; // append value to output
 // if counter divisible by 5,
 // append newline to String output
 if ( counter % 5 == 0 )
 output += "\n";
        }
 System.out.print(output);
    }
    
}
