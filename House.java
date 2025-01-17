import java.util.ArrayList; //import ArrayList 
//This is a House class and extends Building
public class House extends Building {
  private ArrayList<String> residents; //names of residents stored in here
  private boolean hasDiningRoom; //true or false if house has dining room

  /**
   * Constructs a House by taking in name, address, floor, hasDining. Initializes name, address, floor through super class
   * @param name String name of resident
   * @param address String address of house
   * @param floor String number of floors in house
   * @param hasDining Boolean if house has dining or not
   */
  public House(String name, String address, int floor, boolean hasDining) {
    super(name, address, floor); 
    residents = new ArrayList<>(); 
    this.hasDiningRoom = hasDining; 
    System.out.println("You have built a house: 🏠");
  }

  /**
   * If House has dining room or not
   * @return boolean true/false if house has dining room
   */
  public boolean hasDiningRoom() { 
    return this.hasDiningRoom; 
  }

  /**
   * Number of residents in house
   * @return an int, or number of residents in house
   */
  public int nResidents() {
    return residents.size(); 
  }

  /**
   * Throws exception if resident already in house, otherwise adds resident to house
   * @param name String name of resident
   */
  public void moveIn(String name) { 
    if (residents.contains(name)) { 
      throw new RuntimeException(name + " is already in the house"); 
    }
    else {
      this.residents.add(name); 
    }
  }

  /**
   * Throws exception if residents not in name, otherwise removes the resident from house
   * @param name String name of resident
   * @return String name of resident who moved out
   */
  public String moveOut(String name) { 
    if (!residents.contains(name)) { 
      throw new RuntimeException(name + " is not in the house");
    }
    else {
      this.residents.remove(name); 
      return name; 
    }
  }

  /**
   * If person is resident or not in House object
   * @param person String name of resident
   * @return true/false if resident lives in the house or not
   */
  public boolean isResident(String person) { 
    if(residents.contains(name)) { 
      return true; 
    }
    else {
      return false; 
    }
  }
  
  //Testing the house class
  public static void main(String[] args) {
    House home = new House("Hubbard", "123 Name St.", 3, true);
    home.moveIn("Isabelle"); 
    home.moveIn("Dani"); 

    home.isResident("Isabelle"); 
  }

}