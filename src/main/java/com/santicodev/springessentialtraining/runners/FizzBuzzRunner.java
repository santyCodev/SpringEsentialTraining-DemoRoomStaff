package com.santicodev.springessentialtraining.runners;

import com.santicodev.springessentialtraining.SpringessentialtrainingApplication;
import com.santicodev.springessentialtraining.data.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FizzBuzzRunner {
    private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzRunner.class);

    public void run() throws Exception {
        LOG.info("FizzBuzz runner: Start");
        for (int i = 0; i < 101; i++) {
            String result = "";
            result += (i % 3) == 0 ? "Fizz" : "";
            result += (i % 5) == 0 ? "Buzz" : "";
            LOG.info("FizzBuzz runner: " + (!result.isEmpty() ? result : "" + i));
        }
        LOG.info("FizzBuzz runner: Finish");
    }
}
