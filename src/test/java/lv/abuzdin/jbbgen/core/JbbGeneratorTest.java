package lv.abuzdin.jbbgen.core;

import lv.abuzdin.jbbgen.BuilderPreferences;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class JbbGeneratorTest {

    @InjectMocks
    JbbGenerator generator;

    @Test
    public void shouldReturnStatusNoSourceFoundForEmptyPreferences() {
        BuilderPreferences pref = new BuilderPreferences();

        long status = generator.generate(pref);

        assertThat(status, is(1L));
    }
}
