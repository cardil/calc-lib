package pl.gov.coi.example.calc;

import org.junit.Assert;
import org.junit.Test;

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

        addrer42.add(a, b);

        // then
        Assert.fail("Not yet implemented");

    }

}
