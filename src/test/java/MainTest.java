import URLstuff.URLgetJSON;
import URLstuff.URLparams;
import WeatherData.TempInCelsius;
import WeatherData.TempInKelvin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testParamsToString() {
        URLparams params = new URLparams();
        params.setParams("city", "bestCity");
        params.setParams("someNumbers", "someOtherNumbers");
        assertEquals("?city=bestCity&someNumbers=someOtherNumbers", params.toString());
    }

    @Test
    public void testTemp() throws Exception {
        String APPID = "c74e7d9cbebfa6f9951ae05891bd31c5";
        String city = "Lviv";
        String url = "http://api.openweathermap.org/data/2.5/weather";
        URLparams params = new URLparams();
        params.setParams("q", city);
        params.setParams("APPID", APPID);
        String JSON = new URLgetJSON(url, params).toString();
        assertEquals((new TempInKelvin(JSON).getTemperatureData() - 273.15), (new TempInCelsius(JSON).getTemperatureData()), 0);
    }
}
