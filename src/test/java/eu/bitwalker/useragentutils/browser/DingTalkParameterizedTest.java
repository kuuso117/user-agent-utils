package eu.bitwalker.useragentutils.browser;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class DingTalkParameterizedTest extends AbstractUserAgentParameterizedTest {

    public DingTalkParameterizedTest(String userAgentValue, Browser expectedBrowser, String expectedBrowserVersion, OperatingSystem expectedOS) {
        super(userAgentValue, expectedBrowser, expectedBrowserVersion, expectedOS);
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {
                    "Mozilla/5.0 (Linux; U; Android 14; zh-CN; 23116PN5BC Build/UKQ1.230804.001) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/100.0.4896.58 UWS/5.6.0.9 Mobile Safari/537.36 AliApp(DingTalk/7.1.16) com.alibaba.android.rimet/33798650 Channel/700159 language/zh-CN abi/64 xpn/xiaomi UT4Aplus/0.2.25 colorScheme/dark",
                        Browser.DING_TALK,
                        "7.1.16",
                        OperatingSystem.ANDROID14
                },
        });
    }
}
