package WeatherData;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Description {
    private String JSON;

    public Description(String JSON) {
        this.JSON = JSON;
    }

    public String getDescription() throws ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(JSON);
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray descArr = (JSONArray) jsonObject.get("weather");
        JSONObject desc = (JSONObject) descArr.get(0);

        return "" + desc.get("description");
    }
}
