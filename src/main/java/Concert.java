public class Concert extends Event{
    private String artist;
    private String genre;



    public Concert(String artist, String genre,String name, String date, int price, int maxCapacity, int bookedTickets, String type){
        super( name,  date,  price,  maxCapacity, type);
        this.artist = artist;
        this.genre = genre;


    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

        public void getInfo(){
            System.out.println(getType() + getName() + " by " + getArtist() );
            System.out.println("date: " + getDate());
            System.out.println("price " + getPrice());
            System.out.println("booked " + getBookedTickets().size() + "/" + getMaxCapacity() + " tickets");
            if(isSoldOut()) {
                System.out.println("Status: AVAILABLE");
            } else {
                System.out.println("Status: SOLD OUT ");
            }


        }
}
