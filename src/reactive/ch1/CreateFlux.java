package reactive.ch1;
import reactor.core.publisher.Flux;

public class CreateFlux {
    public static Flux emptyFlux(){
        return Flux.empty();
    }
    public static Flux fooBarFromValues(){
        return Flux.just("foo","bar");
    }

    public static void main(String[] args) {
       // System.out.println(emptyFlux());
        System.out.println(fooBarFromValues().map(value-> value+ "some").count().
                subscribe(value-> System.out.println(value)));
    }
}
