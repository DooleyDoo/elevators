package foo;

//NOTE: Let's simplify.  Elevator can only do one trip request a time
//      If it is making a trip then it is occupied
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
  
   public boolean isAvailable( )      { return online;  }
   public boolean needsMaintenance( ) {  return ! online;  }

   public void maintainElevator( )  {
      //FIXME: does nothing but flip flag
      online = true;
   }


   public boolean checkTripRequest( TripRequest req ) {
      if (! online) {
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
      //call report.movingFloorToFloor() for the move 
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
}


