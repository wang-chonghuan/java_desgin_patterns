package jjexam.printdecorator.print;

public class DocketDecoratorHeader1 extends DocketDecorator{
    public DocketDecoratorHeader1(SalesDocket salesDocket) {
        super(salesDocket);
    }

    public void prtDocket() {
        System.out.println("this is header1");
        super.callTrailer();
    }
}
