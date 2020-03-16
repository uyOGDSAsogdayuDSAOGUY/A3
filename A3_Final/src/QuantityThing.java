//Subclass  of class Thing  which is used for a Thing with an int counter.
public class QuantityThing extends Thing{
	//new variables. ---Phase 3b: A Thing with a quantity---
    public String measurement;    //Unit of measurement.
    public double weightPerUnit;  //The weight of one unit of the stored item.
    public static int units;      //The quantity of what is stored.
    public static int maxCapacity;//The maximum capacity.
    /*
     * Method that returns the total weight of this Thing plus all the items it contains. ---Phase 3b: A Thing with a quantity---
     */
    public double totalWeight() {
    	return super.totalWeight() + (units * weightPerUnit);
    }
    /*
     * Method check unit and maxCapacity . Units should not be equal to 0 , and less then maxCapacity. ---Phase 3b: A Thing with a quantity---
     */
    public int remainingCapacity() {
		 if (units != 0){
	         if(units < maxCapacity ) {
	             maxCapacity += units;
	         }
	     }
		 return maxCapacity;	 
    }
    /*
     * Auto-generated constructor stub ---Phase 3b: A Thing with a quantity---
     */
	public QuantityThing(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
}
