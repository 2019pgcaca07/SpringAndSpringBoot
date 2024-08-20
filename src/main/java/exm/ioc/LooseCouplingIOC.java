package exm.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingIOC {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContextIOCfeatures.xml");
        //fetching data through mySql
        DataManager dataManagerForMysql = (DataManager) context.getBean("dataManagerForMysql");
        System.out.println(dataManagerForMysql.displayData());

        //fetching data through webService
        DataManager dataManagerForWebService = (DataManager) context.getBean("dataManagerForWebService");
        System.out.println(dataManagerForWebService.displayData());

    }
}
