package proxy.demo.静态代理;

/**
 * @Coder 17
 * @ClassName DelegationCar
 * @Description TODO
 * @date 2022/6/7 21:16
 * @Version 1.0
 */
public class DelegationCar implements Car {

    @Override
    public String getName() {
        return "BMW";
    }

    @Override
    public String getColor() {
        return "PINK";
    }
}
