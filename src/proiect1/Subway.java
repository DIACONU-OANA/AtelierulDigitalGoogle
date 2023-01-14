package proiect1;

public class Subway implements CommunityTransport{
    @Override
    public void ticketprice() {
        System.out.println("The price of the subway ticket is 3 lei");
    }

    @Override
    public void average_speed() {
        System.out.println("The average speed of the subway is 80 km/h");
    }
}
