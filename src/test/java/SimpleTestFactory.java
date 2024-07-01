import org.example.FixFirst;
import org.example.FixSecond;
import org.testng.annotations.Factory;

public class SimpleTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new SimpleTest(new FixFirst()),
                new SimpleTest(new FixSecond()),
        };
    }
}
