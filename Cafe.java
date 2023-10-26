/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int floors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, floors); 
        this.nCoffeeOunces = nCoffeeOunces;  
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups; 

        System.out.println("You have built a cafe: ☕");
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if(nCoffeeOunces - size <= 0 || this.nSugarPackets - nSugarPackets <= 0 || this.nCreams <= 0) {
            throw new RuntimeException("We are out of stock!"); 
        }
        else {
            nCoffeeOunces -= size; 
            this.nSugarPackets -= nSugarPackets; 
            this.nCreams -= nCreams; 
            this.nCups = nCups - 1; 
        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { 
        this.nCoffeeOunces += nCoffeeOunces; 
        this.nSugarPackets += nSugarPackets; 
        this.nCreams += nCreams; 
        this.nCups += nCups; 
    }

    public static void main(String[] args) {
        Cafe Familiars = new Cafe("Familiars", "456 Food St.", 1, 2, 3, 4, 2);
        Familiars.restock(2, 2, 2, 2); 

        
    }
    
}
