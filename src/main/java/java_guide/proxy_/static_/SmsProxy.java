package java_guide.proxy_.static_;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/24 17:04
 * @Version 1.0
 */
public class SmsProxy implements SmsService {
    private SmsService smsService;
    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("before...");
        smsService.send(message);
        System.out.println("after...");
        return null;
    }
}
