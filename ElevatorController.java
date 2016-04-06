package foo;

//?? Do we need to be ElevatorReportable
protected class ElevatorController {
   private List<Elevator> elevators;

   public ElevatorController( List<Elevators> elevs ) {
      elevators = elevs;
   }


   public void tripRequest( TripRequest req )
          throws NoAvailableElevatorException {
      for ( Elevator e : elevators ) {
         if (e.isAvailable() == false) {
            continue;
         }
         //FIXME: poll elevators looking for a suitable one
      }
   }
}


