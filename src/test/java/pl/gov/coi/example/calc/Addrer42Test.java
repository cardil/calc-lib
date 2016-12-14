package pl.gov.coi.example.calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="krzysztof.suszynski@wavesoftware.pl">Krzysztof Suszyński</a>
 * @since 2016-12-14
 */
public class Addrer42Test {
    @Test
    public void testAdd() {
        // given
        int a = 5;
        int b = 4;
        Addrer42 addrer42 = new Addrer42();
        // when

        int result = addrer42.add(a, b);

        // then
        assertEquals(9, result);
    }

}
