package Steps;

import io.qameta.allure.Allure;
import Pages.VideoPlayerPage;

public class VideoPlayerPageSteps extends VideoPlayerPage {
    public VideoPlayerPageSteps openChannel() {
        Allure.step("Відкрити канал під відео", () -> {
            avatarImgClick();
        });
        return this;
    }
}
