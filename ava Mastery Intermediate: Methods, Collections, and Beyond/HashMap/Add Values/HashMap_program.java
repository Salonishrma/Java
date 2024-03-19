import java.util.HashMap;
public class HashMap_program {
    public static void main(String[] args) {
        //create HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //adding keys and values (Countries,City)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("India","Delhi");
        capitalCities.put("USA","NY");
        System.out.println(capitalCities);
    }
}
