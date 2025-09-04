package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private static final ElementsCollection videosCollections = $$x("//*[@id=\"video-title\"]/yt-formatted-string");

    protected SearchPage clickVideoByIndexInternal(int index) {
        videosCollections.get(0).should(Condition.visible, Duration.ofSeconds(10));
        int size = videosCollections.size();
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Індекс виходить за кордони списку: " + index + ", кількість відео: " + size);
        }
        videosCollections.get(index).should(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }

}
