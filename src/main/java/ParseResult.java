import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ZZZ on 2017/7/13.
 */
public class ParseResult {


    public boolean isSkip() {
        return isSkip;
    }

    public void setSkip(boolean skip) {
        isSkip = skip;
    }


    public Map<String, Object> getData() {
        return data;
    }

    private Map<String, Object> data = new LinkedHashMap<String, Object>();
    private boolean isSkip = false;

}
