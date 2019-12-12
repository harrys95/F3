package CS5800COM;
/**
 * The main manipulates objects in the hierarchy using the component interface.
 */

public class Main {
	
    public static void main(String[] args) {
    	SubPart light = new Part("light", 120);// supart light and price
    	SubPart stereo = new Part("stereo", 180);// subpart stereo and cost
    	SubPart leather = new Part("leather", 300);// subpartleather and cost
        
    	SubPart exterior = new Modify("Exterior");// defining the main
    	exterior.addSubPart(light);// adding light
    	exterior.addSubPart(stereo);// adding subpart streo
    	exterior.addSubPart(leather);// adding subpart leather
        
        SubPart car = new Modify("car");// adding new subpart
        car.addSubPart(exterior);
        car.addSubPart(new Part("tyre", 800));// adding subpart tyre
        
        System.out.println(light);
        System.out.println(exterior);
        System.out.println(car);
             
    }
    
}