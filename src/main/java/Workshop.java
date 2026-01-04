public class Workshop extends Event{

    private String instructor;
    private String topic;
    private String materialsIncluded;


    public Workshop(String instructor,String topic, String materialsIncluded, String name, String date, int price, int maxCapacity, int bookedTickets, String type){
        super( name,  date,  price,  maxCapacity, type);

        this.instructor = instructor;
        this.materialsIncluded = materialsIncluded;

    }

    public String getInstructor() {
        return instructor;
    }

    public String getTopic() {
        return topic;
    }


    public void getInfo(){
        System.out.println(getType() + getName() + " with " + getInstructor() );
        System.out.println("date: " + getDate());
        System.out.println("price " + getPrice());
        System.out.println("booked " + getBookedTickets().size() + "/" + getMaxCapacity() + " tickets");
        System.out.println("Materials included: " + materialsIncluded);
        if(isSoldOut()) {
            System.out.println("Status: AVAILABLE");
        } else {
            System.out.println("Status: SOLD OUT ");
        }



    }

}
