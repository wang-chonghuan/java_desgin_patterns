package Command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Stock {
    private final String name;
    private final int quantity;
    public void buy() {
        log.info("buy stock {} amount {}", this.name, this.quantity);
    }

    public void sell() {
        log.info("sell stock {} amount {}", this.name, this.quantity);
    }
}
