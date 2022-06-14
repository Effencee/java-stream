package stream_z1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(1,n -> n+1)
                .filter(elem -> elem>10)
                .filter(elem -> elem <100)
                .filter(elem -> elem%3==0)
                .limit(20)
                .map(elem -> elem*3)
                .forEach(System.out::println);
    }
}
