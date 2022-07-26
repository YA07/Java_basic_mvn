package java_guide.proxy_.dynamic_;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/24 17:21
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
