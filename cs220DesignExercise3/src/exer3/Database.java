package exer3;

import java.util.HashMap;
import java.util.UUID;

/* This is basically the teller's computer. It stores information on each customer, and 
 * allows customers to swipe their cards. */
public class Database {
  public HashMap<UUID,DataEntry> map;
  
  public Database() {
    map = new HashMap<UUID,DataEntry>();
  }
  
  /* Adds data of a customer to the database, associated with their membership card. */
  public void addCustomer(MembershipCard c, DataEntry d) {
    map.put(c.readID(), d); // Reads the ID from the card, and looks it up in the map.
  }
  
  public DataEntry swipe(MembershipCard c) {
    return map.get(c.readID());
  }
  
}
