import java.util.ArrayList;

public abstract class Event {
    private String name;
    private String date;
    private int price;
    private int maxCapacity;
    private ArrayList<Integer> bookedTickets = new ArrayList<>();
    private String type;


    public Event(String name, String date, int price, int maxCapacity, String type) {
    this.name = name;
        this.date = date;
this.price = price;
this.maxCapacity = maxCapacity;
this.type = type;

    }


    public void addBooking(int antalTicket) {    //det er her, som ticketen bliver booket

        if (bookedTickets.size() > maxCapacity || antalTicket > maxCapacity) {
            System.out.println("Fejl solgt ud");
        } else {
            for (int i = 1; i <= antalTicket; i++) {
                bookedTickets.add(antalTicket);

            }
        }
    }


    public boolean isSoldOut(){
     if(bookedTickets.size() >= maxCapacity) {
                  return false;
                } else {
            return true;
        }

    }

    public void getInfo(){

    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public ArrayList<Integer> getBookedTickets() {
        return bookedTickets;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
