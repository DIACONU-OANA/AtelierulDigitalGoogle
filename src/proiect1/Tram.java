package proiect1;

public class Tram implements CommunityTransport{
    @Override
    public void ticketprice() {
        System.out.println("The price of the tram ticket is 3 lei");
    }

    @Override
    public void average_speed() {
        System.out.println("The average speed of the tram is 40 km/h");
    }
}
