import java.util.List;
import java.util.Map;

public class C5_Parser {

    private static final String dn = "CN=Иванов Иван Иван оглы,ADDR=350072, Краснодарский кр., г. Краснодар, ул. Солнечная, д. 15 к. 5,OU=Development,DC=magnit,DC=ru";

    public static void main(String[] args) {
        List<Map.Entry<String, String>> parsed = parse(dn);
        System.out.println(parsed);
    }

    private static List<Map.Entry<String, String>> parse(String dn) {
        return null;
    }
}
