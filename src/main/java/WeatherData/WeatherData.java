package WeatherData;

import org.json.simple.parser.ParseException;

public class WeatherData {
    private String description;
    private double tempInKelvin;
    private double tempInCelsius;

    public WeatherData(String JSON) throws ParseException {
        description = new Description(JSON).getDescription();
        tempInKelvin = new TempInKelvin(JSON).getTemperatureData();
        tempInCelsius = new TempInCelsius(JSON).getTemperatureData();
    }
    public String getWeatherData(){
        return "desc: "+description+
                "\ntemp in K: "+tempInKelvin+
                "\ntemp in C: "+tempInCelsius;
    }
}
