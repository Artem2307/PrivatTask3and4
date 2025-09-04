package Steps;

import io.qameta.allure.Allure;
import pages.ChannelPage;


public class ChannelPageSteps extends ChannelPage {
    public ChannelPageSteps subscribeWithoutLoginAndCheckMessage(String ... text) {
        Allure.step("Відкрити канал, натиснути на кнопку 'ПІДПИСАТИСЯ' та перевірити повідомлення про необхідність увійти у профіль з текстом: "
                + String.join(", ", text), () -> {
            subscribeButtonClick();
            checkTextPresent(text);

        });
        return this;
    }
}
