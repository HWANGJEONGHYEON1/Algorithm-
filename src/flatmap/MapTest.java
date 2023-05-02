package flatmap;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonString = "[\n" +
                "  {\n" +
                "    \"id\": \"8592219951\",\n" +
                "    \"type\": \"IssueCommentEvent\",\n" +
                "    \"actor\": {\n" +
                "      \"id\": 47848,\n" +
                "      \"login\": \"rafaelfranca\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"8592214995\",\n" +
                "    \"type\": \"IssueCommentEvent\",\n" +
                "    \"actor\": {\n" +
                "      \"id\": 47848,\n" +
                "      \"login\": \"rafaelfranca\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"8592181459\",\n" +
                "    \"type\": \"IssuesEvent\",\n" +
                "    \"actor\": {\n" +
                "      \"id\": 1550934,\n" +
                "      \"login\": \"brentkearney\"\n" +
                "    }\n" +
                "  }\n" +
                "]";
        Map<String, Object>[] map = gson.fromJson(jsonString, Map[].class);


        for (Map<String, Object> stringObjectMap : map) {
            for (String s : stringObjectMap.keySet()) {
                System.out.println("key = " + s + " value= " + stringObjectMap.get(s));
            }
        }
    }
}
