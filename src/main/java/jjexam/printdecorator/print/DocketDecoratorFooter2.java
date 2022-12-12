package jjexam.printdecorator.print;

public class DocketDecoratorFooter2 extends DocketDecorator{
    public DocketDecoratorFooter2(SalesDocket salesDocket) {
        super(salesDocket);
    }

    public void prtDocket() {
        System.out.println("this is footer2");
        super.callTrailer();
    }
}
