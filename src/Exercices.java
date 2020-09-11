import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {

    public List exercice1(List<String> liste) {
        return liste.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public List exercice2(List<String> liste){
        return liste.stream().filter(word -> !word.equals("INUTILE")).collect(Collectors.toList());
    }

    public String exercice3(List<String> liste){
        return liste.stream().collect(Collectors.joining());
    }


    public String exercice4(List<String> liste){
        return liste.stream().map(String::toUpperCase).filter(x -> !x.equals("AAA")).collect(Collectors.joining());
    }

    public List exercice5(List<Integer> liste){
        List <Integer> listeModifie = liste.stream().map(n -> n * 2).collect(Collectors.toList());
        return listeModifie;
    }

    public Integer exercice6(List<Integer> liste){
        Integer resultat = liste.stream().reduce((x, y) -> x * y).get();
        return resultat;
    }

    public List exercice7(List<Integer> liste){
        return liste.stream().filter(n -> (n*n) > 50).collect(Collectors.toList());
    }

    public List exercice8(List<Integer> liste){
        return liste.stream().map(n -> n * 9).map(n -> n.toString().charAt(0)).collect(Collectors.toList());
    }

    public List exercice9(){
        return IntStream.iterate(1, n -> n+1).filter(x -> x % 3==0 && x % 7==0)
                .limit(10).boxed().collect(Collectors.toList());
    }

    public List exercice10(){
        return IntStream.iterate(1, n -> n + 1)
                .map(n -> n*n).limit(20).boxed().collect(Collectors.toList());
    }
}