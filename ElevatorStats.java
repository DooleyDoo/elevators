package foo;

public class ElevatorStats {
   private int numTrips;
   private int numFloorsPassed;

   public ElevatorStats( ) {
      numTrips = 0;
      numFloorsPassed = 0;
   }

   public int getnumTrips( )          { return numTrips;  }
   public int getnumFloorsPassed( )   { return numFloorsPassed;  }

   public void incTrips( ) {                 {  numTrips++; }
   public void addToFloorsPassed( int add )  {  numFloorsPassed += add;  }
}

