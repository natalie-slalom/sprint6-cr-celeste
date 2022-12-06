package com.slalom.api;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculationControllerTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void getCalculation() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/calculation?number1=23&number2=77", String.class);
        assertThat(response.getBody()).isEqualTo("{\"id\":1,\"content\":\"The total is: 100.\"}");

        ResponseEntity<String> responseDefault = template.getForEntity("/calculation", String.class);
        assertThat(responseDefault.getBody()).isEqualTo("{\"id\":2,\"content\":\"The total is: 0.\"}");
    }

}