package Command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderSellStock implements Order {
    private final Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
