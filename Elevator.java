package foo;

public class Elevator {
   private Building building;
   private ElevatorReportble report;

   private int currentFloor;
   // True if working.  False if needs to be maintained
   private boolean online;

   private ElevatorStats stats;
   

   public Elevator( Building bld, report ) {
      this.building = bld;
      this.report = report;

      stats = new ElevatorStats();

      currentFloor = building.getInitialElevatorFloor();
      online = true;
   }


   public ElevatorStats getStats( )   {  return stats;  }

  
   public boolean needsMaintenance( ) {  return ! online;  }

   public void maintainElevator( )  {
      //FIXME: does nothing but flip flag
      online = true;
   }
}


