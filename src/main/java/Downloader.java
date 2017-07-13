import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by ZZZ on 2017/7/13.
 */

public class Downloader implements IDownloader {
    public Page download(String url) {

        Page page = new Page();

        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpClientBuilder httpClientBuilder = HttpClients.custom();
        HttpGet httpGet = new HttpGet(url);

        try {
            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity httpEntity = response.getEntity();

            page.setText(EntityUtils.toString(httpEntity));


        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return page;
    }


}
