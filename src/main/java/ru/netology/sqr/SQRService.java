package ru.netology.sqr;

public class SQRService {
    public int squareNamberService(int rangeFrom, int rangeTo) {
        int amountOfNumber = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeFrom && i * i <= rangeTo) {
                amountOfNumber++;
            }
        }
        return amountOfNumber;
    }
}