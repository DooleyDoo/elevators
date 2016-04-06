package foo;

public class ElevatorStats {
   private int numTrips;
   private int numFloorsPassed;
   private int numTripsSinceMaintenance;

   public ElevatorStats( ) {
      numTrips = 0;
      numFloorsPassed = 0;
      numTripsSinceMaintenance = 0;
   }

   public int getNumTrips( )          { return numTrips;  }
   public int getNumFloorsPassed( )   { return numFloorsPassed;  }
   public int getNumTripsSinceMaintenance( )   {
      return numTripsSinceMaintenance;
   }

   protected void resetTripsSinceMaintenance( ) {
      numTripsSinceMaintenance = 0;
   }

   protected void incTrips( ) {                 {
      numTrips++;
      numTripsSinceMaintenance++;
   }
   protected void addToFloorsPassed( int add )  {  numFloorsPassed += add;  }
}

