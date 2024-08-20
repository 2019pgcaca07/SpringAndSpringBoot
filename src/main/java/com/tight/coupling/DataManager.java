package com.tight.coupling;

public class DataManager {

    //creating instance of DataProviderUsingMysql
    private DataProviderUsingMysql data = new DataProviderUsingMysql();
    public String displayData(){
        return data.provideData();
    }

    //creating instance of DataProviderUsingWebService
    private DataProviderUsingWebService datafromWebServer = new DataProviderUsingWebService();
    public String displayDataforwebServer(){
        return datafromWebServer.provideData();
    }

}
