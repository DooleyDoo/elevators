package foo;

public class Building {
   private int minFloor;
   private int maxFloor;

   public Building( int min, int max ) {
      minFloor = min;
      maxFloor = max;
   }

   /** @return True if okay for elevator to go from floor # to floor #
    *          False if out of bounds, raging fire, whatever
    */
   protected boolean validateElevatorMove( int startFloor, int endFloor ) {
        //FIXME: Could eventually check floors in between
      return isFloorOkay(startFloor) && isFloorOkay(endFloor);
      
      //FIXME: Maybe we should throw an exception for fire, terrorists...
   } 

   protected int getInitialElevatorFloor( ) {
      return minFloor;
   }


   private boolean isFloorOkay( int floor ) {
      return ((floor >= minFloor) && (floor <= maxFloor));
   }
}


