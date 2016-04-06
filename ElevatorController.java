package foo;

//?? Do we need to be ElevatorReportable
protected class ElevatorController {
   private List<Elevator> elevators;

   public ElevatorController( List<Elevators> elevs ) {
      elevators = elevs;
   }


   public void tripRequest( TripRequest req )
          throws NoAvailableElevatorException {
      Elevator best = null;
      int bestFloors = 99999999;
      for ( Elevator e : elevators ) {
         if (e.checkTripRequest(req) == false) {
            continue;
         }
         int i = req.getStartFloor() - e.getCurrentFloor();
         i = (i < 0) ? -i : i;
           //If it is on the same floor, occupied or not, then it is the best
           //one--and satisfies exception in point 7)
         if (i == 0) {
            best = e;
            bestFloors = 0;
            break;
         }
         if (i < bestFloors) {
            best = e;
            bestFloors = i;
         }
      }
      if (best == null) {
         throw new NoAvailableElevatorException();
      }
      best.makeTrip(req); 
   }
}


