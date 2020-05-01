package Controllers;

import java.util.Random;

/**
 *
 * @author GENISYS-X
 */
public final class RandomNumbers {
  
    /**
     *
     * @return
     */
    //Genrate random no's
    public static int randomFunction(){
     
    Random randomGenerator = new Random();
   
      int randomInt = randomGenerator.nextInt(3);
     
       return randomInt;
   }
  
    /**
     *
     * @return
     */
    public static int getInt()
  {
	  return 10;
  }
  
}