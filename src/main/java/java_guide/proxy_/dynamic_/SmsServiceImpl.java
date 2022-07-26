package java_guide.proxy_.dynamic_;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/24 17:15
 * @Version 1.0
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message" + message);
        return message;
    }
}
