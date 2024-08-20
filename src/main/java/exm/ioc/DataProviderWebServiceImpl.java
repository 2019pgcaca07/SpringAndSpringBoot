package exm.ioc;

public class DataProviderWebServiceImpl implements DataProvider {

    @Override
    public String providedata() {
        return "This is the data from webservice";
    }
}
