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
        //keyset() --- getting only keys
        //values() --- to get only values

        //loop through the keys
        for(String i:capitalCities.keySet()){
            System.out.println(i);
        }

        //loop through the values
        for(String i:capitalCities.values()){
            System.out.println(i);
        }
        //to get keys and value loop through
        for(String i:capitalCities.keySet()){
            System.out.println("key " + i +", value "+capitalCities.get(i) );
        }
    }
}
