package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void test1() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer convert = converter.convert("10");
        Assertions.assertThat(convert).isEqualTo(10);
    }

    @Test
    void test2() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String convert = converter.convert(10);
        Assertions.assertThat(convert).isEqualTo("10");
    }

    @Test
    void test3() {
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort convert = converter.convert("127.1.1.1:8080");
        Assertions.assertThat(convert.getIp()).isEqualTo("127.1.1.1");
    }

    @Test
    void test4() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort ip = new IpPort("127.0.0.1", 8080);
        String convert = converter.convert(ip);
        Assertions.assertThat(convert).isEqualTo("127.0.0.1:8080");
    }
}
