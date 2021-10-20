/**
 * @author 12777
 */
public class Example1 {
    public static void main (String[] args) {
        FuelTank ft = new FuelTank(100);
        System.out.println(ft.gas);
        Car car =new  Car();
        car.run(ft);
        System.out.println(ft.gas);
    }
}
  class FuelTank {
    int gas;
    FuelTank(int x) {
        gas = x;
    }
}
class Car {
    void run(FuelTank ft) {
        ft.gas = ft.gas - 5;
    }
}
