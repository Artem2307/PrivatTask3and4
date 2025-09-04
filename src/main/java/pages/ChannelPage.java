package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ChannelPage {
    private static final SelenideElement subscribeButton = $x("//*[@id=\"page-header\"]//button[contains(@class,\"yt-spec-button-shape-next\")]");
    private static final SelenideElement titleLogin = $x("//div[@id=\"contentWrapper\"]//ytd-modal-with-title-and-button-renderer");

    protected ChannelPage subscribeButtonClick(){
        subscribeButton.should(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public ChannelPage checkTextPresent(String... texts) {
        for (String text : texts) {
            titleLogin.shouldHave(Condition.text(text),Duration.ofSeconds(10)).shouldBe(Condition.visible);
        }
        return this;
    }
}
