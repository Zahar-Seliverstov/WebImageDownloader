import java.io.File;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        String websiteUrl = "https://www.hse.ru/education/magister/";
        String destinationFolder = "C:\\Users\\Suchmypin\\Downloads";   // Ваш путь куда вы хотите сохранить изображения

        URLImageExtractor imageExtractor = new URLImageExtractor();
        Set<String> imageUrls = imageExtractor.extractImageUrls(websiteUrl);

        ImageDownloader imageDownloader = new ImageDownloader();
        int imageCounter = 1;
        for (String imageUrl : imageUrls) {
            String extension = imageUrl.replaceAll("^.+\\.", "").replace("?.+$", "");
            String destinationPath = destinationFolder + File.separator + imageCounter++ + "." + extension;
            imageDownloader.downloadImage(imageUrl, destinationPath);
        }
    }
}
