import java.util.ArrayList;//import for ArrayList. 

//Subclass of Thing  .Thing that can store other Things.
public class ContainerThing extends Thing {
	//new variable. ---Phase 4: ArrayLists ---
	static ArrayList<Thing> listThings  = new ArrayList<Thing>();// ArrayList that  store any kind of Thing as an Object. ---Phase 4: ArrayLists ---
	boolean isDrawn ; // boolean variable. ---Phase 4: ArrayLists ---
	/*
	 * A method that returns the weight of the Thing itself plus all Things inside itself. ---Phase 4: ArrayLists ---
	 */
	public double totalWeight() {
		return super.totalWeight()+QuantityThing.units;		
	}
	/*
	 *  The maximum combined weight capacity of all Things stored in itself. ---Phase 4: ArrayLists ---
	 */
	public double maxWeightCapacity(){
		return QuantityThing.maxCapacity;	
	}
	/*
     * Auto-generated constructor stub  ---Phase 4: ArrayLists ---
     */
	public ContainerThing(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Add thing to the listThings.  ---Phase 4: ArrayLists ---
	 */
	public boolean addThing(Thing newThing){									
        if(newThing + totalWeight() < maxWeightCapacity()){  // check . If ok add. ***I do not know how to convert . ***
        	listThings.add(newThing); //add to the end.        
        	return true;
        	isDrawn = false ;
        }else{       
        	return false;
     } 
    }
	/*
	 * ArrayList remove method.  ---Phase 4: ArrayLists --- 
	 */
    public Thing removeThing(Thing toRemove){
      if(toRemove.equals(listThings)){ 			// check . If ok remove. 
    	  listThings.remove(toRemove);
    	  isDrawn = true;
      }else {
    	  return null;
     }
	return toRemove;
    }
}