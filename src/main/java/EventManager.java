import java.util.ArrayList;
import java.util.Collections;

public class EventManager {

    public ArrayList<Event> events = new ArrayList<>();

    public EventManager(){


    }

    public void addEvent(Event e){
        events.add(e);

    }

    public void bookTicket(Event e,int antalTicket){  //det er her jeg kalder på at ticketen skal blive booket, for et event. Så her vælger jeg eventtet først, for bag efter at jeg kalder for metoden i selve eventtet, som booker et tickett for den.
        e.addBooking(antalTicket);


    }

    public void printSummary(){
        for(Event e : events){
            e.getInfo();
        }

    }

    public void getMostPopular(){
     Event mostPopular = events.get(0);

          for(Event e : events) {
              if(e.getBookedTickets().size() > mostPopular.getBookedTickets().size()){
                  mostPopular = e;
          }
              System.out.println("Most popular event: " + e.getName() + e.getBookedTickets().size());
          }

    }
}

