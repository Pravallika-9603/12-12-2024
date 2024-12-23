package com.neoteric.java.jpa.monthlyExpenses;

import java.util.ArrayList;
import java.util.List;

public class EmiService {
    BillPeriod billPeriod;
    public EmiService(BillPeriod billPeriod){
        this.billPeriod=billPeriod;
    }

    public void emiSchedule(Transaction tran,int noofMon,Double intrest){

        List<SmartEmi> smartEmiList=new ArrayList<>();

        Double amountPerMon=tran.getTransAmount()*intrest/noofMon;

        for(int i=0;i<noofMon;i++){

            SmartEmi smartEmi=new SmartEmi();
            smartEmi.setAmountperMon(amountPerMon);
            smartEmi.setAmountLeft(smartEmi.getAmout()-smartEmi.getAmountperMon());
            smartEmiList.add(smartEmi);

        }

    }

    public void emiService(Transaction transaction,int noofMon){

        if(transaction.getTransDate().before(billPeriod.getFromDate())||transaction.getTransDate().after(billPeriod.getFromDate())||transaction.getTransDate().before(billPeriod.getToDate())){

        }

    }

}
