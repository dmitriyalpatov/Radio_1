package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @Test
    public void  CurrentStation () {

        int currentStation;
        Radio rad = new Radio();
        rad.currentStation=5;
        int actual=rad.currentStation;
        int expected =5;
        assertEquals(expected, actual);
    }

    @Test
    public void PressNextStation() {

        Radio rad = new Radio();
        rad.currentStation =7;
        int nextStation = 1;
        int actual = rad.currentStation + nextStation ;
        int expected =8;
        assertEquals(expected, actual);
    }

    @Test
    public void previousRadioStation() {

        Radio rad = new Radio();
        rad.currentStation =7;
        int previousStation = 1;
        int actual = rad.currentStation - previousStation ;
        int expected =6;
        assertEquals(expected, actual);
    }

    @Test
    public void theBeginningOfTheWaveTrack() {

        Radio rad = new Radio();
        rad.currentStation =0;
        int previousStation = 0;
        int actual = rad.currentStation - previousStation ;
        int expected =0;
        assertEquals(expected, actual);
    }

    @Test
    public void endOfTheWaveTrack() {

        Radio rad = new Radio();
        rad.currentStation =0;
        int previousStation = 0;
        int actual = rad.currentStation - previousStation ;
        int expected =0;
        assertEquals(expected, actual);

    }

    @Test
    public void choosingRadioWave() {

        Radio rad = new Radio();
        rad.currentStation =0;
        int previousStation =0 ;
        int actual = rad.currentStation - previousStation ;
        int expected =0;
        assertEquals(expected, actual);
    }




}


