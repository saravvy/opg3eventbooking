public class Main {

        public static void main(String[] args){


        EventManager sara = new EventManager();
        Event hej = new Concert("Pierce the veil","alternative rock","Skibidi","23/11/2026",67,90,0,"Concert");
        Event hey = new Workshop("Din mor","insraframwad","yes","ADSFDSF","59/09/2677",78,3,0,"Workshop");

        sara.addEvent(hej);
        sara.addEvent(hey);

        sara.bookTicket(hey,2);
        sara.bookTicket(hej,67);

        sara.printSummary();

        sara.getMostPopular();
        }
}
