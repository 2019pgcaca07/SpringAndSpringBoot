package com.loose.coupling;

public class DataProviderMySQLImpl implements DataProvider {

    @Override
    public String providedata() {
        return "This is a data from mysql";
    }
}
