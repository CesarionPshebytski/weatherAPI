package URLstuff;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class URLparams {
    private Map<String, String> params = new HashMap<String, String>();

    public void setParams(String key, String value) {
        params.put(key, value);
    }

    @Override
    public String toString() {
        Iterator iterator = params.entrySet().iterator();
        String urlParams = "?";
        while (iterator.hasNext()) {
            Map.Entry param = (Map.Entry) iterator.next();
            urlParams += param.getKey() + "=" + param.getValue();
            if (iterator.hasNext()) urlParams += "&";
        }
        return urlParams;
    }
}
