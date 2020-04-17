import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
            HashMap<String, String> trackList = new HashMap<String, String>();
            trackList.put("Bye Bye Bye", "I'm doin this tonight");
            trackList.put("It's gonna be me", "Every little thing I do");
            trackList.put("Home", "I wanna go home");
            trackList.put("Sunflower", "You're my sunflower");

            System.out.println(trackList.get("Home"));

            Set<String> keys = trackList.keySet();
            for(String key : keys) {
                System.out.println("key"+key);
                System.out.println("lyric"+trackList.get(key));
            }
    }
}