package Steps;

import io.qameta.allure.Allure;
import pages.VideoPlayerPage;

import static Settings.GenerateRandomNumber.number;

public class VideoPlayerPageSteps extends VideoPlayerPage {
    public VideoPlayerPageSteps openChannel() {
        Allure.step("Відкрити канал під відео", () -> {
            avatarImgClick();
        });
        return this;
    }
}
