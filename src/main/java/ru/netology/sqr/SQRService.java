package ru.netology.sqr;

public class SQRService {
    public int squaresnumber (int param1, int param2){
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= param1 && i * i <= param2) {
                counter++;
            }
        }
        return counter;
    }

}
