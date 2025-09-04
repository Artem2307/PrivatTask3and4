package Steps;

import io.qameta.allure.Allure;
import Pages.SearchPage;

public class SearchPageSteps extends SearchPage {

    public SearchPageSteps clickVideoByIndexStep(int index) {
        Allure.step("Клік по відео з списку під номером: " + index, () -> {
            clickVideoByIndexInternal(index);
        });
        return this;
    }
}
