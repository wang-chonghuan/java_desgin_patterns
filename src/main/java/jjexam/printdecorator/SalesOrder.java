package jjexam.printdecorator;

import jjexam.printdecorator.print.SalesDocket;
import jjexam.printdecorator.tax.TaxStrategy;

public class SalesOrder {

    private final SalesDocket docket;

    public SalesOrder(SalesDocket docket) {
        this.docket = docket;
    }

    public void calcTax(String country) {
        TaxStrategy.create(country).calcTax();
    }

    public void prtDocket() {
        docket.prtDocket();
    }
}
