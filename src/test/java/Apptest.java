import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Apptest {

    @Test
    void testAdd() {
        assertEquals(30, App.add(10, 20));
    }
}