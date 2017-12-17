package WeatherData;

import org.json.simple.parser.ParseException;

public class TempInCelsius {
    private String JSON;
    public TempInCelsius(String JSON){
        this.JSON = JSON;
    }
    public double getTemperatureData() throws ParseException {
        return new TempInKelvin(JSON).getTemperatureData() - 273.15;
    }
}
