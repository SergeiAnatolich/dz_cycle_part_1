package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "general case,200,300,3",
            "lower bound,100,120,1",
            "upper bound,110,121,1",
            "out of range lower,0,99,0",
            "out of range upper,10000,12000,0"
    })
    public void shouldSquareNamberService(String testName, int rangeFrom, int rangeTo, int expected) {
        SQRService service = new SQRService();

        int actual = service.squareNamberService(rangeFrom, rangeTo);

        assertEquals(expected, actual);
    }
}