import java.util.ArrayList;//import for ArrayList. 

//Game controller class. 
public class GameController {
	// new variables. --- Phase 3a: Thing - Subclasses and polymorphism ---
	 public static int counterSSS = 0 ; //counter variable.
	 static ArrayList<Thing> allThings  = new ArrayList<Thing>(); //Array of all Things objects that I have created.
	  public static int frameTime = 1/60; //Frame time .
/*
 * Main method. --- Phase 3a: Thing - Subclasses and polymorphism ---
 */
 public static void main(String[] args){
	 //clean the array and add +1 to the counterSSS.
	 if(true){
		 allThings.clear();
	        counterSSS++;
	     }
	 //Add the data to the allThings array . 
	    if(true){
	       allThings.add(counterSSS);     // I do not know how to convert . 
	    } 
	while(true){
	
	 StdDraw.show(frameTime);			   // show frame Time .
  }
 }
}
