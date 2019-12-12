package CS5800COM;

import java.util.ArrayList;
/**
 * A Modify stores child components in addition to implementing methods defined by the subpart interface.
 * modify implement methods defined in the subpart interface by delegating to child s.
 * In addition modify provide additional methods for adding, removing, as well as getting parts.
 */
public class Modify implements SubPart {

    private final ArrayList<SubPart> itemList;
    
   	@SuppressWarnings("unused")
	private final String partName;

    public Modify(String partName) {// defining the part name
        this.partName = partName;
        itemList = new ArrayList<SubPart>();
    }

    @Override
    public void addSubPart(SubPart item) {// adding a part
        itemList.add(item);
    }

    @Override
    public void removeSubPart(SubPart item) {// removing subparts
        itemList.remove(item);
    }

    @Override
    public SubPart[] getSubParts() { // to get sub parts
        return itemList.toArray(new SubPart[itemList.size()]);
    }

    @Override
    public double getCost() {// get cost of subparts
        double totalCost = 0;
        for (SubPart item : itemList) {
            totalCost += item.getCost();// sum of item
        }
        return totalCost;// sum of all items
    }

    @Override
    public String getPartName() {
        String partName = this.partName()+ "<";
        for (int i = 0; i < itemList.size(); i++) {
            SubPart item = itemList.get(i);
            if (i != itemList.size() - 1) {
            	partName += item.getPartName() + ",";
            } else {
            	partName += item.getPartName();
            }
        }

        return partName + ">";
    }
    
    private String partName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
        return "["+this.getPartName()+" :$"+this.getCost()+"]";//  partname and cost
    }
}