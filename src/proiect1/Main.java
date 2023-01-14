package proiect1;

public class Main {
    public static void main(String[] args) {
        ComTransportFactory transportFactory= new ComTransportFactory();
        CommunityTransport communityTransport1=  transportFactory.getTransport(Strategy.BS);
        communityTransport1.ticketprice();
        communityTransport1.average_speed();
        System.out.println("\n");

        CommunityTransport communityTransport2=  transportFactory.getTransport(Strategy.SB);
        communityTransport2.ticketprice();
        communityTransport2.average_speed();
        System.out.println("\n");

        CommunityTransport communityTransport3=  transportFactory.getTransport(Strategy.TRN);
        communityTransport3.ticketprice();
        communityTransport3.average_speed();
        System.out.println("\n");

        CommunityTransport communityTransport4=  transportFactory.getTransport(Strategy.TRM);
        communityTransport4.ticketprice();
        communityTransport4.average_speed();
        System.out.println("\n");


    }


}
