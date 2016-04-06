package foo;


public class ElevatorSimulation implements ElevatorReportable {
   private Building building;
   private List<Elevator> elevators;
   private ElevatorController controller;



   public ElevatorSimulation( int numFloors, int numElevs ) {
      building = new Building(1, numFloors - 1);
      
      elevators = new ArrayList<Elevators>();
      for (int i=0; i < numElevs; i++) {
         elevators.add(new Elevator(building));
      }

      controller = new ElevatorController(elevators);
   }


   //throw something??
   public Elevator requestElevator( int floor )  {
      controller.requestElevator(floor);
   }


   /** @return An elevator that needs to be maintained.  Null if none.  */
   protected Elevator getElevatorForMaintenance( ) {
      for ( Elevator e : elevators ) {
         if (e.needsMaintenance()) {
            return e;
         }
      }
      return null;
   }
}


