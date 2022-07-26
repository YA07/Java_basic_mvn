package java_guide.proxy_.dynamic_;

import java.lang.reflect.Proxy;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/24 17:21
 * @Version 1.0
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }
}
