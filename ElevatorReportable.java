package foo;

public interface ElevatorReportable {
   public void openingDoor( Elevator e );
   public void closingDoor( Elevator e );

   //FIXME: Don't like these two
   public void movingFloorToFloor( Elevator e, int floor, int nextFloor );
   public void makingTrip( Elevator e, int floor, int final floor );

   public void shuttingDownForMaintenance( Elevator e );
}

