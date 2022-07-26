package proxy.dynamic_proxy;

import proxy.static_proxy.ITeacherDao;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxyInstance);
    }
}
