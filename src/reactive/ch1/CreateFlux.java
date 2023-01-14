package reactive.ch1;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CreateFlux {
    public static Flux emptyFlux(){
        return Flux.empty();
    }
    public static Flux fooBarFromValues(){
        return Flux.just("foo","bar");
    }
    public static Flux<String> fooBarFluxFromList() {
        List<String> list = Arrays.asList("foo","bar");
        return Flux.fromIterable(list);
    }

    public static Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

    public static Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }


    public static void main(String[] args) {
       // System.out.println(emptyFlux());
        System.out.println(fooBarFromValues().map(value-> value+ "some").count().
                subscribe(value-> System.out.println(value)));
        //System.out.println(errorFlux());
    }
}
