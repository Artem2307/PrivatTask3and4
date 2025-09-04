package Steps;

import io.qameta.allure.Allure;
import pages.SearchPage;

public class SearchPageSteps extends SearchPage {

    public SearchPageSteps clickVideoByIndexStep(int index) {
        Allure.step("Клик по видео з списку під номером: " + index, () -> {
            clickVideoByIndexInternal(index);
        });
        return this;
    }
}
