package JavaCollectionsFramework.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    
    public static void main(String[] args) {
        
        Map<String,String> stateAbbreviations = new HashMap<>();

        stateAbbreviations.put("California","USA");
        stateAbbreviations.put("New York","NY");
        stateAbbreviations.put("Ohio", "OH");
        stateAbbreviations.put("Texas","TX");

        System.out.println(stateAbbreviations.get("Ohio")); //Key based search and returns the object, Null otherwise
        System.out.println(stateAbbreviations.containsKey("Texas"));//Key based search, returns True/False
        System.out.println(stateAbbreviations.containsValue("OH"));//Value based search, returns True/False

        
        stateAbbreviations.putIfAbsent("Washington","WA");//if key exists even if value is different, doesnt change anything, returns value already existing
        stateAbbreviations.put("Ohio","DVL"); //takes over ohio value putting dvl on it
        System.out.println("-------------------------------------------");
        for (String temp : stateAbbreviations.keySet()){
            System.out.println(stateAbbreviations.get(temp));
        }


    }
}
