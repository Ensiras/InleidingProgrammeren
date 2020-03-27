package mocking.trajectPrijs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @Mock
    TrajectNaarTrajectEenhedenService trajectEenhedenService;
    @Mock
    TrajectEenhedenNaarPrijsService eenhedenNaarPrijsService;

    @InjectMocks
    TrajectPrijsService tps = new TrajectPrijsService();

    @Test
    @DisplayName("Given itinerary from Almere to Amsterdam, price should be 6.")
    void getTrajectPrijsFromAlmereToAmsterdam() {
        when(trajectEenhedenService.getTrajectEenheden("Almere", "Amsterdam")).thenReturn(10);
        when(eenhedenNaarPrijsService.getPriceTrajectEenheden(10)).thenReturn(6);
        InOrder inOrder = inOrder(trajectEenhedenService, eenhedenNaarPrijsService);

        int result = tps.getTrajectPrijs("Almere", "Amsterdam");

        inOrder.verify(trajectEenhedenService).getTrajectEenheden("Almere", "Amsterdam");
        inOrder.verify(eenhedenNaarPrijsService).getPriceTrajectEenheden(10);
        assertThat(result).isEqualTo(6);
    }

    //Asserting exception in one statement:
    @Test
    void whenInvalidNameIsGivenThrowInvalidLocationException() {
        when(trajectEenhedenService.getTrajectEenheden("Almere", "Diemen-Zuid WTC Business District"))
                .thenThrow(new InvalidLocationException("This location does not exist!"));

        //Invoke method and assert proper exception is being thrown
        assertThatThrownBy(() -> tps.getTrajectPrijs("Almere", "Diemen-Zuid WTC Business District"))
                .isInstanceOf(InvalidLocationException.class)
                .hasMessage("This location does not exist!");

    }

    //Asserting exception in given, when, then fashion:
    @Test
    void whenInvalidNameIsGivenEtcGivenWhenThen() {
        //Catching exception in this variable when method is called
        when(trajectEenhedenService.getTrajectEenheden("Almere", "Diemen-Zuid WTC Business District"))
                .thenThrow(new InvalidLocationException("This location does not exist!"));

        Throwable thrown = catchThrowable(() -> tps.getTrajectPrijs("Almere", "Diemen-Zuid WTC Business District"));

        //Using variable thrown for assertion
        assertThat(thrown)
                .isInstanceOf(InvalidLocationException.class)
                .hasMessage("This location does not exist!")
                .hasMessageContaining("This");
    }
}