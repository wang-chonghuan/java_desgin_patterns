package jjexam.printdecorator.print;

public class DocketDecoratorFooter1 extends DocketDecorator{
    public DocketDecoratorFooter1(SalesDocket salesDocket) {
        super(salesDocket);
    }

    public void prtDocket() {
        System.out.println("this is footer1");
        super.callTrailer();
    }
}