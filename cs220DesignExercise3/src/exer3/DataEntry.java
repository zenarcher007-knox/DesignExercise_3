package exer3;

/* An entry for the DataBase */
public class DataEntry {
  private String customerName;
  private CoffeeType coffeePref;
  private int coffeeCount;
  private int cupons;
  public DataEntry(String name, CoffeeType coffeePref) {
    this.customerName = name;
    this.coffeePref = coffeePref;
    this.coffeeCount = 0;
  }
  
  /* Get functions */
  public String getName() { return customerName; }
  public CoffeeType getCoffeePref() { return coffeePref; }
  public int getCoffeeCount() { return coffeeCount; }
  public int getCuponsAvailable() { return cupons; }
  
  /* Set functions */
  public void rename(String name) { customerName = name; } // A typo? A legal change in name?
  public void changeCoffeePref(CoffeeType pref) { coffeePref = pref; } // Updates coffee preference.
  
  /* Records the retrival of a cupon */
  public void redeemCupon() {
    if(cupons > 0)
      --cupons;
  }
  
  /* Records when a customer buys a cup of coffee */
  public void recordCoffeeTransaction() {
    ++coffeeCount;
    if(coffeeCount >= 3) {
      coffeeCount = 0;
      ++cupons;
    }
  }
}
