package at.fhtw.Design.API.Service;

import org.springframework.stereotype.Service;

@Service
public class AreaService {
    public double calculateCircleArea(double value) {
        return Math.round(Math.PI * value * value * 100.0) / 100.0;
    }

    public double calculateSquareArea(double value) {
        return Math.round(value * value * 100.0) / 100.0;
    }
}
