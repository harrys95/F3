package CS5800COM;
/*
 * SubPart is the abstraction for leafs and composites.
 * It defines the interface that must be implemented by the objects in the composition.
 * For example a file system resource defines getPartName , getCost methods for parts and items.
 */
public interface SubPart {
    public String getPartName();
    public double getCost();
    void addSubPart(SubPart item);
    void removeSubPart(SubPart item);
    SubPart[] getSubParts();
    
}
