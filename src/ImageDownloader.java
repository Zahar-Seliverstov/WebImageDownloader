import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ImageDownloader {

    public void downloadImage(String imageUrl, String destinationPath) throws Exception {
        URL url = new URL(imageUrl);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        FileOutputStream outputStream = new FileOutputStream(destinationPath);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        outputStream.close();
        inputStream.close();
    }
}

