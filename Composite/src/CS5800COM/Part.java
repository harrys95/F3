package CS5800COM;

public class Part implements SubPart {
	/**
	 * Leafs are objects that have no children.
	 * They implement services described by the SubPart interface.
	 * For example a file object implements  getSize getpartname methods which are related to the SubPart.
	 */
    private final String partName;
    private final double cost;
    
    public Part(String partName, double cost) {
        this.partName = partName;
        this.cost = cost;
    }
    
    // empty implementation for unit parts

    @Override
    public void addSubPart(SubPart item) { //implementation for addition
    }

    @Override
    public void removeSubPart(SubPart item) {// remove
    }

    @Override
    public SubPart[] getSubParts() {// implementation of getting subparts
        return null;
    }

    @Override
    public String getPartName() {// Get name of the part
        return partName;
    }

    @Override
    public double getCost() {// Getting cost implementation
        return cost;
    }
    
    @Override
    public String toString() {
        return "["+partName+":$"+cost+"]";
    }
}