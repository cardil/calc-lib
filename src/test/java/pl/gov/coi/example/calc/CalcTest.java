package pl.gov.coi.example.calc;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class CalcTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private Addrer addrer;

    @Test
    public void testAdd() {
        // given
        int a = 5;
        int b = 4;
        when(addrer.add(anyInt(), anyInt()))
            .thenReturn(111);
        Calc calc = new Calc(addrer);

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(111, result);
    }

}
