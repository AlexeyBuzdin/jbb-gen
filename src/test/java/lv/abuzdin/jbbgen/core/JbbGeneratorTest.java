package lv.abuzdin.jbbgen.core;

import lv.abuzdin.jbbgen.BuilderPreferences;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JbbGeneratorTest {

    @InjectMocks
    JbbGenerator generator;

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnStatusNoSourceFoundForEmptyPreferences() {
        BuilderPreferences pref = new BuilderPreferences();

        generator.generate(pref);
    }
}
