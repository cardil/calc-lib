package pl.gov.coi.example.calc;

/**
 * @author <a href="krzysztof.suszynski@wavesoftware.pl">Krzysztof Suszyński</a>
 * @since 2016-12-14
 */
public class Addrer42 implements Addrer {
    public int add(int a, int b) {
        if (a < 42) {
            return a + b;
        } else {
            return 42;
        }
    }
}
