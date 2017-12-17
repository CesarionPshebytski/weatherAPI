package WeatherData;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TempInKelvin {
    private String JSON;
    public TempInKelvin(String JSON){
        this.JSON = JSON;
    }
    public double getTemperatureData() throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(JSON);
        JSONObject temp = (JSONObject) obj.get("main");

        return Double.parseDouble(temp.get("temp").toString());
    }
}
