import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HelloJavaMitForEach {
    public static void main(String[] args)
    {
        List<String> liste = new ArrayList<>();
        for(String s : liste)
        {
            System.out.println(s);
        }
        liste.forEach((String s) -> System.out.println(s));
        Consumer<String> consumer = (String s) -> System.out.println(s);
        liste .forEach(System.out :: print );


    }
    public static boolean isPrim(final long value) {
        if (value <= 2) {
            return (value == 2);
        }
        for (long i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}