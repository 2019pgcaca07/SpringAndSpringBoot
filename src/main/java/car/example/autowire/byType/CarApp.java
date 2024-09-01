package car.example.autowire.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");
        Car car =(Car) context.getBean("car");
        car.displaySpecification();
    }
}
