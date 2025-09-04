package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTask extends BaseTest{
    @BeforeClass
    public void beforeTest(){
        homePageSteps
                .selectLanguage("Українська");
    }

    @Test
    @Description("Завдання №3 з почти від Наталії")
    @Severity(SeverityLevel.CRITICAL)
    public void testTask() {
        homePageSteps
                .openYouTubeAndSearchRandomQuery(1);

        searchPageSteps
                .clickVideoByIndexStep(3);

        videoPlayerPageSteps
                .openChannel();

        channelPageSteps
                .subscribeWithoutLoginAndCheckMessage(
                        "Хочете підписатися на цей канал?"
                        ,"Щоб підписатися на цей канал, увійдіть у свій обліковий запис."
                        ,"Увійти");

    }

    @AfterTest
    public void afterTest(){
      //тут ми щось робимо після тесту
    }
}
