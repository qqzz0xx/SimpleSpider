import java.io.IOException;

/**
 * Created by ZZZ on 2017/7/13.
 */

public interface IDownloader {
    public Page download(String url) throws IOException;

}
