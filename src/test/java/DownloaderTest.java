import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZZZ on 2017/7/13.
 */
public class DownloaderTest {

    @Test
    public void DownLoad()
    {
        Downloader downloader = new Downloader();
        Page page =  downloader.download("http://www.baidu.com");

        System.out.println(page.text);

    }


}