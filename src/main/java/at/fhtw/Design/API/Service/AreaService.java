package at.fhtw.Design.API.Service;

import org.springframework.stereotype.Service;


@Service
public class AreaService {
    private static final double PI = 3.14;
    public double calculateCircleArea(double value) {
        return PI * value * value;
    }
    public double calculateSquareArea(double value) {
        return value * value;
    }
}

