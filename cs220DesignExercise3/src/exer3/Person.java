package exer3;

/* A Person, to help demonstrate use of the system */
public class Person {
  private MembershipCard card; // A Person is given a card by Starbucks.
  private String name; // Each individual has their own name,
  private String coffeePref; // ...and coffee preference.
  
  public Person(String name, String coffeePref, MembershipCard card) {
    this.card = card;
    this.name = name;
    this.coffeePref = coffeePref;
  }
  
  /* Asks the person to take out their membership card. */
  public MembershipCard askForCard() { return card; }
  public String askForName() { return name; }
  public String askForCoffeePref() { return coffeePref; }
}
