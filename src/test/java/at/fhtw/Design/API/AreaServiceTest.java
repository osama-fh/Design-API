package at.fhtw.Design.API;

import at.fhtw.Design.API.Service.AreaService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaServiceTest {
    private AreaService areaService = new AreaService();


    @Test
    public void testCalculateSquareArea() {
        double value = 3;
        double expected = 9;
        double actual = areaService.calculateSquareArea(value);
        assertEquals(expected, actual, 0.01);
    }
}
