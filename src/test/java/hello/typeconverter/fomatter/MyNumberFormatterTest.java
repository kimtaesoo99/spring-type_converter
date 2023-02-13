package hello.typeconverter.fomatter;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.*;

class MyNumberFormatterTest {

    MyNumberFormatter myNumberFormatter = new MyNumberFormatter();

    @Test
    public void parse() throws Exception{
        Number result = myNumberFormatter.parse("1,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000L);
    }

    @Test
    public void print() throws Exception{
        String result = myNumberFormatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000");
    }
}
