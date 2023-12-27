package eu.bitwalker.useragentutils.browser;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class WechatParameterizedTest extends AbstractUserAgentParameterizedTest {
    public WechatParameterizedTest(String userAgentValue, Browser expectedBrowser, String expectedBrowserVersion, OperatingSystem expectedOS) {
        super(userAgentValue, expectedBrowser, expectedBrowserVersion, expectedOS);
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                // 微信
                {
                    "Mozilla/5.0 (Linux; Android 13; Mi 10 Pro Build/TKQ1.221114.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/111.0.5563.116 Mobile Safari/537.36 XWEB/1110053 MMWEBSDK/20230805 MMWEBID/5436 MicroMessenger/8.0.42.2460(0x28002A58) WeChat/arm64 Weixin NetType/5G Language/zh_CN ABI/arm64",
                        Browser.WECHAT,
                        "8.0.42.2460",
                        OperatingSystem.ANDROID13
                },
                // 微信pc
                {
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36 NetType/WIFI MicroMessenger/7.0.20.1781(0x6700143B) WindowsWechat(0x63090819) XWEB/8519 Flue",
                        Browser.WECHAT_PC,
                        "7.0.20.1781",
                        OperatingSystem.WINDOWS_10
                },
                // 企业微信
                {
                    "Mozilla/5.0 (Linux; Android 14; 23116PN5BC Build/UKQ1.230804.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/109.0.5414.86 MQQBrowser/6.2 TBS/046811 Mobile Safari/537.36 wxwork/4.1.15 MicroMessenger/7.0.1 NetType/4G Language/zh Lang/zh ColorScheme/Dark",
                        Browser.WECHAT_ENTERPRISE,
                        "4.1.15",
                        OperatingSystem.ANDROID14
                },
                // 企业微信pc
                {
                    "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.5304.110 Safari/537.36 Language/zh wxwork/4.1.16 (MicroMessenger/6.2) WindowsWechat MailPlugin_Electron WeMail embeddisk",
                        Browser.WECHAT_ENTERPRISE_PC,
                        "4.1.16",
                        OperatingSystem.WINDOWS_10
                },
                // 微信小程序
                {
                        "Mozilla/5.0 (Linux; Android 7.1.1; MI 6 Build/NMF26X; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/57.0.2987.132 MQQBrowser/6.2 TBS/043807 Mobile Safari/537.36 MicroMessenger/6.6.1.1220(0x26060135) NetType/4G Language/zh_CN MicroMessenger/6.6.1.1220(0x26060135) NetType/4G Language/zh_CN miniProgram",
                        Browser.WECHAT_MINI_PROGRAM,
                        "6.6.1.1220",
                        OperatingSystem.ANDROID7
                }
        });
    }
}
