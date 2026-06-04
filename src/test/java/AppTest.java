import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testAdd() {
        assertEquals(100, App.add(2,3));
    }
}
