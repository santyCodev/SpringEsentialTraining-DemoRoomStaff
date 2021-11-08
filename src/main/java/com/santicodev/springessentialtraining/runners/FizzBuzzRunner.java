package com.santicodev.springessentialtraining.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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
