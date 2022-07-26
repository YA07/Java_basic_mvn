package java_guide.reflection_;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/25 11:26
 * @Version 1.0
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
