import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

    private Hashtable<String, Boolean> collection; //Keeps track of title and check out status

    /**
     * Constructs a Library. Uses super class to initialize name, address, floors
     * @param name String name of library
     * @param address String address of library
     * @param floors int number of floors
     */
    public Library(String name, String address, int floors) {
      super(name, address, floors); 
      this.collection = new Hashtable<>(); 
      System.out.println("You have built a library: 📖");
    }
    
    /**
     * Adds title into collection. Throws exception if title is already in collections
     * @param title String name of book and author
     */
    public void addTitle(String title) { 
      if (this.collection.containsKey(title)) {
        throw new RuntimeException("This is already in the system");
      }
      else {
        this.collection.put(title, true); 
      }
    } 
    
    /**
     * Throws exception if title is not in collection, otherwise removes title from collection
     * @param title String name of book and author
     * @return String title removed
     */
    public String removeTitle(String title) { 
      if (!this.collection.containsKey(title)) {
        throw new RuntimeException("This is not in the system"); 
      }
      this.collection.remove(title); 
      return title; 
    }

    /**
     * Throws exception if value in collection is false, otherwise sets value to false.
     * @param title String of book and author
     */
    public void checkOut(String title) {
      if (!this.collection.get(title)) {
        throw new RuntimeException("This cannot be checked out");
      }
      else {
        this.collection.replace(title, false); 
      }
    }

    /**
     * Throws exception if title already in collection, otherwise replaces value with true.
     * @param title String name of book and author
     */
    public void returnBook(String title) {
      if (this.collection.containsKey(title)) {
        throw new RuntimeException("this is already in the system"); 
      }
      else {
        this.collection.replace(title, true); 
      }
    }

    /**
     * If collection has title, return a boolean
     * @param title String name of book
     * @return boolean true/false if collection has title
     */
    public boolean containsTitle(String title) {
      return this.collection.containsKey(title); 
    }

    /**
     * If title is in collection , returns value 
     * @param title String name of title and book
     * @return T/F value of title's check out status
     */
    public boolean isAvailable(String title) {
      return this.collection.get(title); 
    }

    /**
     * prints out the collection's title and check out status 
     */
    public void printCollection() {
      System.out.println(this.collection.toString());
 
      
    }

    //Testing
    public static void main(String[] args) {
      Library lib = new Library("Forbes", "1342 Road St.", 2);

      lib.addTitle("Harry Potter by JK Rowling"); 
      lib.addTitle("The Nightingale by Kristen Hannah"); 

      lib.checkOut("Harry Potter by JK Rowling"); 
      lib.printCollection(); 

    }
  
  }