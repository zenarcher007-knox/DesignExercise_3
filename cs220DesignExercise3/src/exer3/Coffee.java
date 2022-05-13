package exer3;

/* A prop. */
public class Coffee {
  public CoffeeType type;
  public Coffee(CoffeeType type) {
    this.type = type; // There's nothing preventing one from having a custom type of coffee,
    // but the CoffeeType types are the ones on the menu.
  }
  
  @Override
  public String toString() {
    return "Coffee (" + this.type + ")";
  }
}
