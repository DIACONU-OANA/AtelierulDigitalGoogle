package proiect1;

public class ComTransportFactory{
    public CommunityTransport getTransport(Strategy strategy){
        if(strategy==Strategy.BS) return new Bus();
        else if(strategy==Strategy.SB) return new Subway();
        else if (strategy == Strategy.TRN) return new Train();
        else if(strategy== Strategy.TRM) return new Tram();
        return null;
    }
}
