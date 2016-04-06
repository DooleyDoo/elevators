package foo;

public class Building {
   private int minFloor;
   private int maxFloor;

   public Building( int min, int max ) {
      minFloor = min;
      maxFloor = max;
   }

   /** @return True if okay for elevator to go to floor #.
    *          False if out of bounds, raging fire, whatever
    */
   protected boolean floorOkay( int floor ) {
      return ((floor >= minFloor) && (floor <= maxFloor));
      
      //FIXME: Maybe we should throw an exception for fire, terrorists...
   } 

   protected int getInitialElevatorFloor( ) {
      return minFloor;
   }
}


