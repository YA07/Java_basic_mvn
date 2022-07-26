package java_guide.proxy_.static_;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/24 17:07
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
