import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class MuseGen {
    private static final String API_URL = "https://poetrydb.org/random";

    public static void main(String[] args) {
        System.out.println("🎨 MuseGen: Free Poem Generator (using PoetryDB)");

        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int status = conn.getResponseCode();
            if (status != 200) {
                System.out.println("❌ Failed to fetch poem. HTTP Status: " + status);
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse JSON
            JSONArray poems = new JSONArray(response.toString());
            JSONObject poem = poems.getJSONObject(0);
            String title = poem.getString("title");
            String author = poem.getString("author");
            JSONArray lines = poem.getJSONArray("lines");

            System.out.println("\n📝 Title: " + title);
            System.out.println("✍️ By: " + author);
            System.out.println("\n📜 Poem:");
            for (int i = 0; i < lines.length(); i++) {
                System.out.println(lines.getString(i));
            }

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}