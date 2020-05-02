package com.newways.billie.Utils;

public class Previouspayment_detail {

    public Previouspayment_detail(){

    }
    String platenumber,sacconame;
    public Previouspayment_detail(String platenumber,String sacconame){
        this.platenumber=platenumber;
        this.sacconame=sacconame;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getSacconame() {
        return sacconame;
    }

    public void setSacconame(String sacconame) {
        this.sacconame = sacconame;
    }
}
