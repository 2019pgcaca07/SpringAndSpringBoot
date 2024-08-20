package com.loose.coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        //fetch the data from Mysql
        //creating the instance of DataProviderMySQLImpl and assigning to object of DataProvider interface ,which is fine
        DataProvider dataProvider = new DataProviderMySQLImpl();
        //creating object of DataManager and passing the object for which you need to display data
        // as DataManager has a parametrerized constructor
        DataManager dataManager = new DataManager(dataProvider);
        System.out.println(dataManager.displayData());

        //fetch the data from WebService
        //creating the instance of DataProviderWebServiceImpl and assigning to object of DataProvider interface ,which is fine
        DataProvider dataProviderWeb = new DataProviderWebServiceImpl();
        //creating object of DataManager and passing the object for which you need to display data
        // as DataManager has a parametrerized constructor
        DataManager dataManagerWeb = new DataManager(dataProviderWeb);
        System.out.println(dataManagerWeb.displayData());


    }
}
