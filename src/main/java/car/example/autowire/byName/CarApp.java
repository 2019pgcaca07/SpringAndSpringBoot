package car.example.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");
        Car car =(Car) context.getBean("car");
        car.displaySpecification();
    }
}
