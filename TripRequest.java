package foo;

public class TripRequest {
   private int startFloor;
   private int endFloor;

   //FIXME: What about # of people??  Adds lots of complication

   public TripRequest( int start, int end ) {
      beginFloor = start; 
      endFloor = end;
   }

   public int getStartFloor( )  { return startFloor;  }
   public int getEndFloor( )    { return endFloor;  }
}


