package com.plupasit.wksp02_13560220.DataModel;

/**
 * Created by pnplu on 10/10/2016 AD.
 */

public class Datamodel220 {
    private double add_money ;
    private double pay_money;
    private String name_pay;

    public Datamodel220 (double add_money)
    {
        this.add_money = add_money;
    }
    public Datamodel220 (double pay_money, String name_pay)
    {
        this.pay_money = pay_money;
        this.name_pay = name_pay;
    }

    public double getAdd_money() {
        return add_money;
    }

    public void setAdd_money(double add_money) {
        this.add_money = add_money;
    }

    public double getPay_money() {
        return pay_money;
    }

    public void setPay_money(double pay_money) {
        this.pay_money = pay_money;
    }

    public String getName_pay() {
        return name_pay;
    }

    public void setName_pay(String name_pay) {
        this.name_pay = name_pay;
    }
}
