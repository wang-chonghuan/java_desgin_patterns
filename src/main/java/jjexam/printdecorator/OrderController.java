package jjexam.printdecorator;

import jjexam.printdecorator.print.Docket;
import jjexam.printdecorator.print.DocketDecoratorFooter1;
import jjexam.printdecorator.print.DocketDecoratorHeader1;
import jjexam.printdecorator.print.SalesDocket;

public class OrderController {
    private SalesOrder salesOrder;
    public static void prtDocket() {
        SalesDocket salesDocket = new DocketDecoratorHeader1(new DocketDecoratorFooter1(new Docket()));
    }
}
