import URLstuff.URLgetJSON;
import URLstuff.URLparams;
import WeatherData.WeatherData;

public class Main {
    public static void main(String[] args) throws Exception {
        String APPID = "c74e7d9cbebfa6f9951ae05891bd31c5";
        String city = "Lviv";
        String url = "http://api.openweathermap.org/data/2.5/weather";

        URLparams params = new URLparams();
        params.setParams("q", city);
        params.setParams("APPID", APPID);

        String JSON = new URLgetJSON(url, params).toString();

        String weatherData = new WeatherData(JSON).getWeatherData();

        System.out.println(weatherData);
    }
}