package proiect1;

public class Bus implements CommunityTransport{
    @Override
    public void ticketprice() {
        System.out.println("The price of the bus ticket is 3 lei");
    }

    @Override
    public void average_speed() {
        System.out.println("The average speed of the bus is 80 km/h");
    }
}
