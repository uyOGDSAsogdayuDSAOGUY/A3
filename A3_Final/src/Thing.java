// A Thing is an Object that can be carried by a Person or put in a Place. 
public class Thing{
	//new variables. ---Phase 1---
	private double value;	// value variable.
	private double weight;  // weight variable.
	//new variables ---Phase 2---
	private Vector2  position; 				  // position variable.Main point that we will use for drawing. 
	private String drawFile = "Person0.png";  // photo that we will draw.
	boolean isDrawn = false;                  // A flag for whether this Thing should be drawn or not.
	// Instance variables. 
	private String name; // Note: So far name must be set in Constructor
	private String description;
	/*
	 * Method that return the weight. ---Phase 1---
	 */
	public double totalWeight(){
	    return weight;
	}
	/*
	 * Constructor for Thing class. ---Phase 2---
	 */
	public Thing(Vector2 p, String  r) {
	    position = p; drawFile = r; 
	}
	/*
	 * Method that draws a picture by using Vector2 class position. ---Phase 2---
	 */
	public  void draw( ) {
	   isDrawn = true;
	  if(isDrawn){   
	    StdDraw.picture(position.x, position.y,drawFile);
	  }
    }
	/*
	 *Update method.This method does nothing for now. 
	 */
	public void update() {
         
    }
	// Alternate way of assigning variables, using "this" keyword
	public Thing(String name, String description){
		this.name = name;
		this.description = description;
	}

	// returns the name of the Thing
	public String toString(){
		return name;
	}

	// "Accessor" method for description
	public String getDescription(){
		return description;
	}

	// Alternate way of assigning variables, using "this" keyword
	// "Mutator" method for description
	public void setDescription(String description){
		this.description = description;
	}
	
	//---Phase 5: Movement---
	//new variables . 
	private Vector2 destination; // destination variable. ---Phase 5: Movement---
	public double movementSpeed = StdDraw.show(1/GameController.frameTime());// Distance to move per frame .  ---Phase 5: Movement---
	/*
	 * Set a new position for this object to move towards.
	 */
	public boolean setDestination(Vector2 position) {
		
	}

	
}