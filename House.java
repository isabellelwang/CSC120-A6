/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  public House(String name, String address, int floor, boolean hasDining) {
    super(name, address, floor); 
    residents = new ArrayList<>(); 
    this.hasDiningRoom = hasDining; 
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() { 
    return this.hasDiningRoom; 
  }

  public int nResidents() {
    return residents.size(); 
  }

  public void moveIn(String name) { 
    if (residents.contains(name)) { 
      throw new RuntimeException(name + " is already in the house"); 
    }
    else {
      this.residents.add(name); 
    }
  }

  public String moveOut(String name) { 
    if (!residents.contains(name)) { 
      throw new RuntimeException(name + " is not in the house");
    }
    else {
      this.residents.remove(name); 
      return name; 
    }
  }

  public boolean isResident(String person) { 
    if(residents.contains(name)) { 
      return true; 
    }
    else {
      return false; 
    }
  }
  
  public static void main(String[] args) {
    House home = new House("Hubbard", "123 Name St.", 3, true);
    home.moveIn("Isabelle"); 
    home.moveIn("Dani"); 

    home.isResident("Isabelle"); 
  }

}