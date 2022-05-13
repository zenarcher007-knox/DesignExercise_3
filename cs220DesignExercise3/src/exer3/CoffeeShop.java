package exer3;

public class CoffeeShop {
  
  // Updates data on the computer, and makes the preferred coffee of the person in the entry.
  private static Coffee makeFavoriteCoffee(DataEntry entry) {
    entry.recordCoffeeTransaction();
    return new Coffee(entry.getCoffeePref());
  }
  
  // Returns the person's favorite Coffee if elgible, or null if not.
  private static Coffee tryRedeemCupon(DataEntry entry) {
    if(entry.getCuponsAvailable() > 0) {
      entry.redeemCupon();
      return new Coffee(entry.getCoffeePref()); // Don't record a transaction this time...
    }
    return null; // You get nothing...
  }
  
  
  
  public static void main(String[] args) {
    Database dBase = new Database(); // Initialize Barista's computer
    
    // There is a Person. His name is John. He likes black, cream/sugarless coffee, like me.
    // You give him a brand new MembershipCard...
    Person John = new Person("John", CoffeeType.black, new MembershipCard());
    
    { /* ===== Day 1 - registering as a member... ===== */
      // Ask John for the required information, and enter his data into the database...
      MembershipCard card = John.askForCard(); // Enter the card you just gave him 
      // (or probably before you give it to him).
      String name = John.askForName(); // What is your name?
      String coffeePref = John.askForCoffeePref(); // What is your coffee preference?

      // Enter the information into a DataEntry, and put it into the database.
      DataEntry entry = new DataEntry(name, coffeePref);
      dBase.addCustomer(card, entry); // Record the card and the data in the database.
    }
    

    { /* ===== Day 1 ===== */
      // John swipes his card, which is looked up in the database...
      DataEntry dataOnComputer = dBase.swipe(John.askForCard());

      // Read his info...
      System.out.println(dataOnComputer.getCoffeePref()); // etc...

      // John buys 2 cups of coffee. You record those two transactions...
      Coffee forMe = makeFavoriteCoffee(dataOnComputer);  // One for himself,
      // And one for a friend (not a rewards member), who also likes black coffee.
      Coffee forFriend = makeFavoriteCoffee(dataOnComputer);

      // John asks how many cupons he has now. You tell him:
      System.out.println(dataOnComputer.getCuponsAvailable());
      System.out.println("Aww shoot");
      System.out.println(tryRedeemCupon(dataOnComputer));
    }
    
    
    { /* ===== Day 2 ===== */
      // John swipes his card again, and you again pull up his info...
      DataEntry dataOnComputer = dBase.swipe(John.askForCard());
      
      // He buys another cup of coffee...
      Coffee delicious = makeFavoriteCoffee(dataOnComputer);
      
      // Checks if he has any cupons available...
      System.out.println(dataOnComputer.getCuponsAvailable());
      
      // And redeems one.
      Coffee freeCoffee = tryRedeemCupon(dataOnComputer);
      System.out.println(freeCoffee);
      
      
    }
    
    
    
    
    
  }
}
