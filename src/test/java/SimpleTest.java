import org.example.FixClient;
import org.testng.annotations.Test;

public class SimpleTest {
    private final FixClient fixClient;

    public SimpleTest(FixClient fixClient) {
        this.fixClient = fixClient;
    }

    @Test
    public void testMethod() {
        fixClient.makeOrder();
    }
}
