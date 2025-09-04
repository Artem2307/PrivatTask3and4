package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class VideoPlayerPage {
    private static final SelenideElement avatarImgInFullVideo = $x("//*[@id=\"avatar\"]");
    private static final SelenideElement avatarImgInShortVideo  = $x("//*[@id=\"metapanel\"]//div[contains(@class,\"yt-spec-avatar-shape__image-overlays\")]");

    protected VideoPlayerPage avatarImgClick(){
        int timeoutSeconds = 5;
        int waited = 0;
        int intervalMs = 500;

        while (waited < timeoutSeconds * 1000) {
            if (avatarImgInFullVideo.is(Condition.visible)) {
                avatarImgInFullVideo.click();
                return this;
            }
            try {
                Thread.sleep(intervalMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            waited += intervalMs;
        }

        if (avatarImgInShortVideo.is(Condition.visible)) {
            avatarImgInShortVideo.click();
        } else {
            System.out.println("Ни один аватар не виден для клика");
        }

        return this;
    }

}
