package Steps;

import io.qameta.allure.Allure;
import pages.HomePage;

import static Settings.GenerateRandomNumber.number;

public class HomePageSteps extends HomePage{

    public HomePageSteps openYouTubeAndSearchRandomQuery(int index) {
        Allure.step("Вкладка браузера називається “YouTube” і ввести в пошукову строку ->"
                + number +"і клікнути на запропонований пошук і клікнути на елемент номер =" + index+1, () -> {
            checkTabContainsYouTube();
            sendDataSearchString(number);
            clickSeachCollectionIndex(index);
        });
        return this;
    }

    public HomePageSteps selectLanguage(String language) {
        Allure.step("Обрати мову в браузері на" + language, () -> {
            EditButtonClick();
            SettingButtonClick();
            languageClick(language);
        });
        return this;
    }
}
