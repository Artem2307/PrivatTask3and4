package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private static final SelenideElement pageTitle = $x("//title");
    private static final SelenideElement search = $x("//input[@name=\"search_query\"]");
    private static final ElementsCollection seachCollection = $$x("//div[@role=\"presentation\"]");
    private static final SelenideElement editeButton = $x("//button[@id=\"button\"]//yt-icon[@class=\"style-scope ytd-topbar-menu-button-renderer\"]");
    private static final SelenideElement languageSettingButton = $x("//*[@id=\"right-icon\"]/span");
    private static final ElementsCollection languages = $$x("//*[@id=\"label\"]");

    protected HomePage checkTabContainsYouTube() {
        String title = WebDriverRunner.getWebDriver().getTitle();
        if (!title.contains("YouTube")) {
            throw new AssertionError("Тайт не дорівнює 'YouTube', але: " + title);
        }
        return this;
    }

    protected HomePage sendDataSearchString(String text) {
        search.should(visible, Duration.ofSeconds(10)).sendKeys(text);
        return this;
    }


    public HomePage  clickSeachCollectionIndex(int index) {
        seachCollection.get(0).should(visible,Duration.ofSeconds(10));
        int size = seachCollection.size();
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Індекс виходить за кордони списку: " + index + ", кількість запропонованих айтемів для пошуку: " + size);
        }
        seachCollection.get(index).doubleClick();
        return this;
    }

    protected HomePage EditButtonClick() {
        editeButton.should(visible, Duration.ofSeconds(10)).click();
        return this;
    }

    protected HomePage SettingButtonClick() {
        languageSettingButton.should(visible, Duration.ofSeconds(10)).click();
        return this;
    }

    protected HomePage languageClick(String language) {
        languages.filter(text(language)).first().should(visible,Duration.ofSeconds(10)).click();
        return this;
    }





}
