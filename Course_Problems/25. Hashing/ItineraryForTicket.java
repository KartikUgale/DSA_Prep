import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class ItineraryForTicket { // find destionation
    public static List<String> destination(HashMap<String, String> tickets) {
        HashMap<String, String> map = new HashMap<>();

        for (String key : tickets.keySet()) {
            map.put(tickets.get(key), key);
        }

        String firstCity = "";
        for (String key : tickets.keySet()) {
            if (!map.containsKey(key)) {
                firstCity = key;
            }
        }

        List<String> list = new ArrayList<>();
        list.add(firstCity);

        for (String key : tickets.keySet()) {
            list.add(tickets.get(firstCity));
            firstCity = tickets.get(firstCity);
        }

        return list;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        System.out.println(destination(tickets));
    }
}
