import java.util.ArrayList;
import java.util.List;

public class HelloJavaMitForEach {
    public static void main(String[] args)
    {
        List<String> liste = new ArrayList<>();
        for(String s : liste)
        {
            System.out.println(s);
        }
        liste.forEach((String s) -> System.out.println(s));

    }
}