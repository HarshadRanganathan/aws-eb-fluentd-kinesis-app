package com.eb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static final Logger logger =  LoggerFactory.getLogger(RestController.class);

    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("{\"message\": \"Hello World\"}", HttpStatus.OK);
    }

    @GetMapping(value = "/err", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> error() {
        try {
            final int divideByZero = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Runtime error occurred", e);
        }
        return new ResponseEntity<>("{\"error\": \"Runtime Error\"}", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
