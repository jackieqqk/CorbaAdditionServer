package com.invest;



import org.omg.CORBA.ORB;


public class AdditionObj extends AdditionPOA {
    private ORB orb;

    public void setORB(ORB orb_val){
        orb = orb_val;
    }

    public int add(int a, int b){
        int r = a+b;
        return r;
    }

    public void shutdown(){
        orb.shutdown(false);
    }


}
