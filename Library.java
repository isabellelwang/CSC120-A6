/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {

    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int floors) {
      super(name, address, floors); 
      this.collection = new Hashtable<>(); 
      System.out.println("You have built a library: 📖");
    }
    
    public void addTitle(String title) { 
      if (this.collection.containsKey(title)) {
        throw new RuntimeException("This is already in the system");
      }
      else {
        this.collection.put(title, true); 
      }
    } 
    
    public String removeTitle(String title) { 
      if (!this.collection.containsKey(title)) {
        throw new RuntimeException("This is not in the system"); 
      }
      this.collection.remove(title); 
      return title; 
    }

    public void checkOut(String title) {
      if (!this.collection.containsKey(title)) {
        throw new RuntimeException("This cannot be checked out");
      }
      else {
        this.collection.replace(title, false); 
      }
    }

    public void returnBook(String title) {
      if (this.collection.containsKey(title)) {
        throw new RuntimeException("this is already in the system"); 
      }
      else {
        this.collection.replace(title, true); 
      }
    }

    public boolean containsTitle(String title) {
      return this.collection.containsKey(title); 
      
    }

    public boolean isAvailable(String title) {
      return this.collection.get(title); 
    }

    public void printCollection() {
      System.out.println(this.collection.toString());
 
      
    }

    public static void main(String[] args) {
      Library lib = new Library("Forbes", "1342 Road St.", 2);

      lib.addTitle("Harry Potter by JK Rowling"); 
      lib.addTitle("The Nightingale by Kristen Hannah"); 

      lib.checkOut("Harry Potter by JK Rowling"); 
      lib.printCollection(); 

    }
  
  }