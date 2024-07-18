import java.util.List;
import java.util.stream.Collectors;

public class StringList {

    public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3 && s.matches("[a-z]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("art", "alma", "ovo", "armadura", "sol", "Ana", "ave","ato","alameda","a23","ala");
        List<String> filteredList = filterStrings(stringList);
        System.out.println(filteredList);
    }
}
