package tests;

import Steps.ChannelPageSteps;
import Steps.HomePageSteps;
import Steps.SearchPageSteps;
import Steps.VideoPlayerPageSteps;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static Settings.SelenideSetting.selenideSetting;

public abstract class BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps();
    SearchPageSteps searchPageSteps = new SearchPageSteps();
    VideoPlayerPageSteps videoPlayerPageSteps = new VideoPlayerPageSteps();
    ChannelPageSteps channelPageSteps = new ChannelPageSteps();

    @BeforeTest()
    public static void setUp(){
        selenideSetting();
    }

    @AfterTest
    public static void afterTests(){
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }

}
