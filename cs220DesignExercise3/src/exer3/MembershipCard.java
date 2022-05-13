package exer3;

import java.util.UUID;

public class MembershipCard {
  UUID memberID;
 
  
  /* Constructor. Creates a new card with a randomly generated membership number on its data.
   * If you lose your card, you won't be able to access your data. */
  public MembershipCard() {
    memberID = UUID.randomUUID();
  }
  
  public UUID readID() {
    return memberID;
  }
}
