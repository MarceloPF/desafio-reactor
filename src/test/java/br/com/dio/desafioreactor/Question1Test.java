package br.com.dio.desafioreactor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Question1Test {

    private Question1 question1;

    @BeforeEach
    void setup() {
	question1 = new Question1();
    }

    @Test
    void incTest() {
	var numbers = Arrays.asList(250L, 250L, 497L);
	var result= question1.inc(numbers);
	assertEquals(1000, result.blockFirst());
    }

    @Test
    void incTestSafe() {
	var numbers = Arrays.asList(1L, 2L, 3L);
	var result = question1.inc(numbers);
	assertEquals(9, result.blockFirst());
    }

    @AfterEach
    void tearDown() {
	question1 = null;
    }

}
