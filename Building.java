public class Building {

    protected String name = "<Name Unknown>"; //Name of building
    protected String address = "<Address Unknown>"; //name of address
    protected int nFloors = 1; // number of floors

    /**
     * Constructs a building, initializes floors, name, address.
     * @param name String name of building
     * @param address String address of building
     * @param nFloors int number of floors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }   
    
    /**
    * Returns name of building
    * @return String name of building
    */
    public String getName() {
        return this.name;
    }

    /**
     * Returns address of building
     * @return String address of building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Returns number of floors
     * @return int number of floors in building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns name, floor, address of building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    //Testing
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
