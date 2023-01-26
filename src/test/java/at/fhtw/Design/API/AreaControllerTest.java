package at.fhtw.Design.API;
import at.fhtw.Design.API.Service.AreaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AreaControllerTest {
    @Mock
    private AreaService areaService;

    @InjectMocks
    private AreaController areaController;

    @Test
    public void testGetCircleArea() {
        double value = 3;
        double expected = 28.27;
        when(areaService.calculateCircleArea(value)).thenReturn(expected);
        double actual = areaController.getCircleArea(value);
        assertEquals(expected, actual);
    }

}

