import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassForTestLog {
    //private static final Logger LOGGER = LogManager.getLogger(FooService.class);

    public void sayHello() {
        log.info("Keyboard not responding. Press any key to continue...");
        log.warn("Congratulations, you are pregnant!");
    }
}
