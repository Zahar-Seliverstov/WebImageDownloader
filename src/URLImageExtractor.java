import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashSet;
import java.util.Set;

public class URLImageExtractor {

    public Set<String> extractImageUrls(String url) throws Exception {
        Set<String> imageUrls = new HashSet<>();
        Document doc = Jsoup.connect(url).get();
        Elements images = doc.select("img[src]");

        for (Element image : images) {
            String imageUrl = image.absUrl("src");
            imageUrls.add(imageUrl);
        }

        return imageUrls;
    }
}
