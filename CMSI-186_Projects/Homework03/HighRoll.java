import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HighRoll{

   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to HighRoller!!\n" );
      System.out.println( "     Press the 'q' key to quit the program." );
      System.out.println("Press 1 to roll all the dice");
      System.out.println("Press 2 to roll a single die");
      System.out.println("Press 3 to calculate the score of the first set");
      System.out.println("Press 4 to save as high score");
      System.out.println("Press 5 to display the high score");
      DiceSet a = new DiceSet( 2, 6 );
      int b = 0;

     // This line uses the two classes to assemble an "input stream" for the user to type
     // text into the program
      BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
      while( true ) {
         System.out.print( ">>" );
         String inputLine = null;
         try {
            inputLine = input.readLine();
            if ( '1' == inputLine.charAt(0)){
              a.DiceSetroll();
              System.out.println("Values to string after roll: " + a.toString());
            }
            if ( '2' == inputLine.charAt(0)){
              System.out.println("Roll of one die: " + a.rollIndividual(0));
            }
            if ( '3' == inputLine.charAt(0)){
              System.out.println("Score of first set: " + a.sum());
            }
            if ( '4' == inputLine.charAt(0)){
              b = a.sum();
            }
            if ( '5' == inputLine.charAt(0)){
              System.out.println("High score: " + b);
            }
            if( 0 == inputLine.length() ) {
               System.out.println("enter some text!:");
            }
            if( 'q' == inputLine.charAt(0) ) {
               break;
            }         }
         catch( IOException ioe ) {
            System.out.println( "Caught IOException" );
         }
      }
   }
}
