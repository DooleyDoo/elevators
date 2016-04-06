package foo;

//NOTE: Let's simplify.  Elevator can only do one trip request a time
//      If it is making a trip then it is occupied
//      Ack, that doesn't work. Point 7) implies more than one
//        occupant--ignore that constraint for now
public class Elevator {
   private Building building;
   private ElevatorReportble report;

   private int currentFloor;
   // True if working.  False if needs to be maintained
   private boolean online;
   private TripRequest currentTrip;

   private ElevatorStats stats;
   

   public Elevator( Building bld, report ) {
      this.building = bld;
      this.report = report;

      stats = new ElevatorStats();

      currentFloor = building.getInitialElevatorFloor();
      online = true;
      currentTrip = null;
   }


   public ElevatorStats getStats( )   {  return stats;  }

   public int getCurrentFloor( )      {  return currentFloor;  }
   public boolean isOccupied( )       {  return (currentTrip != null);  }
  

   public boolean needsMaintenance( ) {  return ! online;  }

   public void maintainElevator( )  {
      //FIXME: does nothing but flip flag
      online = true;
   }


   public boolean isAvailable( ) {
      //FIXME: assumes only one trip request at a time
      return online && (currentTrip == null);
   }

   /** @return True if elevator can service this request.  */
   public boolean checkTripRequest( TripRequest req ) {
      if (! isAvailable()) {
         return false;
      }

        //FIXME: Take current floor into account
      int start = req.getStartFloor();
      int end req.getEndFloor();
      if (building.validateElevatorMove(start, end) == false) {
         return false;
      }
   }

   public void makeTrip( TripRequest( req ) {
   }

   //Called periodially to move elevator from floor to floor
   public void run( ) {
      //move elevator
      //call report.movOneFloor() for the move 
   }


   private void openDoor( ) {
      report.openingDoor(this);
   }

   private void closeDoor( ) {
      report.openingDoor(this);
   }

   private void maintenanceShutdown( ) {
      online = false;
      report.shuttingDownForMaintenance(this);
   }

   private void moveOneFloor( boolean up ) {
      int add = (up) ? 1 : -1;
      report.movingFloorToFloor(this, currentFloor, currentFloor + add);
      stats.addToFloorsPassed(1);
      currentFloor += add; 
   }

   private void endTrip( ) {
      stats.incTrips();
        //FIXME: pull out literal
      if (stats.getNumTripsSinceMaintenance() >= 100) {
         maintenanceShutdown();
      }
   }
}


