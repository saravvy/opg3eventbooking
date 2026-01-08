public class Main {

        public static void main(String[] args){


        EventManager sara = new EventManager();
        Event hej = new Concert("Pierce the veil","alternative rock","concert1","23/11/2026",67,90,0,"Concert");
        Event hey = new Workshop("Anna","insraframwad","yes","ADSFDSF","59/09/2677",78,3,0,"Workshop");

        sara.addEvent(hej);
        sara.addEvent(hey);

        sara.bookTicket(hej,71);
        sara.bookTicket(hey,3);


         //   sara.bookTicket(hej,20);

           // sara.bookTicket(hej,4);
       sara.printSummary();

       // sara.getMostPopular();

        }
}
