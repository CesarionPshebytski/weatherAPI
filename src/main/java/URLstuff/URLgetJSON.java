package URLstuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLgetJSON {
    private String inputLine;

    public URLgetJSON(String URL, URLparams urLparams) throws IOException {
        java.net.URL oracle = new URL(URL + urLparams.toString());
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        inputLine = in.readLine();
        in.close();
    }

    @Override
    public String toString() {
        return inputLine;
    }
}
