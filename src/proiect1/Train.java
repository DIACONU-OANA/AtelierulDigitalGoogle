package proiect1;

public class Train implements CommunityTransport{
    @Override
    public void ticketprice() {
        System.out.println("The price of the train ticket is 20 lei");
    }

    @Override
    public void average_speed() {
        System.out.println("The average speed of the train in Romania is 45 km/h");
    }
}
