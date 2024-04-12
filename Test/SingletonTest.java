
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    @DisplayName("Test Singleton")
    void funcionSingleton(){
        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();
       // Record inst = new Record();

        assertEquals(instancia1,instancia2);

    }


}
