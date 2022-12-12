package jjexam.printdecorator.print;

public class DocketDecorator implements SalesDocket {
    private final SalesDocket trailer;

    public DocketDecorator(SalesDocket salesDocket) {
        this.trailer = salesDocket;
    }
    @Override
    public void prtDocket() {
        //?
    }

    public void callTrailer() {
        trailer.prtDocket();
    }
}
