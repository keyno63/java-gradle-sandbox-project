package tokyo.maigoname.sandbox.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ModuleTest {
    private Module target;

    @BeforeEach
    public void setUp() {
        target = new Module();
    }

    @Test
    void testHello() {
        final String actual = target.hello();
        assertThat(actual).isEqualTo("Hello World!");
    }
}
