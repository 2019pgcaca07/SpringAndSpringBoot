package com.tight.coupling;

public class TightCoupling {
    public static void main(String[] args) {
       DataManager dm = new DataManager();
        System.out.println(dm.displayData());

        System.out.println(dm.displayDataforwebServer());
    }
}
