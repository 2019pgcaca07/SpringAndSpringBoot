package exm.ioc;

public class DataManager {
    DataProvider dataProvider;
    public DataManager(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
    public String displayData(){
        return dataProvider.providedata();
    }
}
