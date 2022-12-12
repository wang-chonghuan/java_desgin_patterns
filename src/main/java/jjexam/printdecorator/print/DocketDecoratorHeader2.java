package jjexam.printdecorator.print;

public class DocketDecoratorHeader2 extends DocketDecorator {
    public DocketDecoratorHeader2(SalesDocket salesDocket) {
        super(salesDocket);
    }

    public void prtDocket() {
        System.out.println("this is header2");
        super.callTrailer();
    }
}
