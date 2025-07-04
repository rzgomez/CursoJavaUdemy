package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//class Dog{}

public class BuildStreams {
    public static void main(String []args){
        
        String[] cities = {"Dublin", "Berlin", "Paris"};
        Stream<String> citiesStream = Arrays.stream(cities);
        System.out.println(citiesStream.count()); // 3

        // or we can use Stream.of()
        citiesStream = Stream.of(cities);
        System.out.println(citiesStream.count()); // 3
        
//        Stream<Integer> streamI = Stream.of(1,2,3);
//        System.out.println(streamI.count()); // 3
//        
//        Stream<String> streamS = Stream.of("a", "b", "c", "d");
//        System.out.println(streamS.count()); // 4
//        
//        Stream<Dog> streamD = Stream.of(new Dog());
//        System.out.println(streamD.count()); // 1

        List<Double> temps = Arrays.asList(98.4, 100.2, 87.9, 108.8);
        System.out.println("Number of temps > 100 is: " +
                temps
                    .stream()
                    .peek(System.out::println)
                    .filter(temp -> temp > 100)
                    .peek(System.out::println)
                    .count());

    }
}

