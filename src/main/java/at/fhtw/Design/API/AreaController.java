package at.fhtw.Design.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/circle")
    public double getCircleArea(@Valid @RequestParam(value = "value", required = true) double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero");
        }
        return areaService.calculateCircleArea(value);
    }

    @GetMapping("/square")
    public double getSquareArea(@Valid @RequestParam(value = "value", required = true) double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero");
        }
        return areaService.calculateSquareArea(value);
    }
}
