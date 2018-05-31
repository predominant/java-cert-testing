import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/**
 *
 * @author graham.weldon
 */
public class CertTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.strasbourg.eu/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            System.out.println("SUCCESS");
            System.exit(0);
        } catch (Exception e) {
            panic(e);
        }
    }

    public static void panic(Exception e) {
        System.out.println("Exception: " + e.getMessage());
        System.out.println(Arrays.toString(e.getStackTrace()));
        System.out.println("ERROR");
        System.exit(1);
    }
}
