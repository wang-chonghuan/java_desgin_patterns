package Command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderBuyStock implements Order {

    private final Stock stock;

    @Override
    public void execute() {
        stock.buy();
    }
}
