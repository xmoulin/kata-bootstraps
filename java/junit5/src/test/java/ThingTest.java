import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThingTest {

    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        System.out.println();
        System.out.println();
        System.out.printf("zlkd");
        System.out.println();

        assertEquals("Food", value);



        for (int innn = 0; innn < ; innn++) {

        }


    }

    public static void main(String[] args) {
        System.out.println("coucou");
    }

    @Test
    void it_should_not_fail() {
        assertTrue(true);
    }
}
