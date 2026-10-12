package num.ic.sad.hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestRestTemplate
class HelloSadControllerTest {
    @Autowired TestRestTemplate rest;

    @Test
    void responds() {
        assertThat(rest.getForEntity("/hello-sad", String.class).getBody())
            .isEqualTo("Hello, SAD!");
    }
}
