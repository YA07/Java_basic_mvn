package proxy.dynamic_proxy;

import proxy.static_proxy.ITeacherDao;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中。。。");
    }
}
