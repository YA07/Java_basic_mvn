package proxy.demo.静态代理;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Coder 17
 * @ClassName ProxyCar
 * @Description TODO
 * @date 2022/6/7 21:18
 * @Version 1.0
 */
public class ProxyCar implements Car {

    private Car delegationCar;
    public ProxyCar(Car delegationCar){
        this.delegationCar = delegationCar;
    }
    @Override
    public String getName() {
        return delegationCar.getName();
    }

    @Override
    public String getColor() {
        return delegationCar.getName();
    }



    public static void main(String[] args) {
        Car delegationCar = new DelegationCar();
        ProxyCar car = new ProxyCar(delegationCar);
        System.out.println(car.getName());
    }
}
