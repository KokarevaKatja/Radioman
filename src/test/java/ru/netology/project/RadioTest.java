package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldChooseFirstStationAsCurrent() {
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNormalCurrentStation() {
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseLastStationAsCurrent() {
        radio.setCurrentStation(12);

        int expected = 12;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseCurrentStationBeforeFirst() {
        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseCurrentStationAfterLast() {
        radio.setCurrentStation(16);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStationAfterNormal() {
        radio.setCurrentStation(6);
        radio.chooseNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStationAfterFirst() {
        radio.setCurrentStation(0);
        radio.chooseNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNextStationAfterLast() {
        radio.setCurrentStation(12);
        radio.chooseNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoosePreviousStationBeforeNormal() {
        radio.setCurrentStation(8);
        radio.choosePreviousStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoosePreviousStationBeforeLast() {
        radio.setCurrentStation(12);
        radio.choosePreviousStation();

        int expected = 11;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoosePreviousStationBeforeFirst() {
        radio.setCurrentStation(0);
        radio.choosePreviousStation();

        int expected = 12;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseMinVolumeAsCurrent() {
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseNormalCurrentVolume() {
        radio.setCurrentVolume(45);

        int expected = 45;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseMaxVolumeAsCurrent() {
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseCurrentVolumeBeforeMin() {
        radio.setCurrentVolume(-7);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseCurrentVolumeAfterMax() {
        radio.setCurrentVolume(123);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpAfterNormal() {
        radio.setCurrentVolume(34);
        radio.volumeUp();

        int expected = 35;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpAfterMin() {
        radio.setCurrentVolume(0);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpAfterMax() {
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDownAfterNormal() {
        radio.setCurrentVolume(74);
        radio.volumeDown();

        int expected = 73;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDownAfterMin() {
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDownAfterMax() {
        radio.setCurrentVolume(100);
        radio.volumeDown();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLastStation() {
        int expected = 12;
        int actual = radio.getLastStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetFirstStation() {
        int expected = 0;
        int actual = radio.getFirstStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinVolume() {
        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxVolume() {
        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {

        radio.setMaxVolume(100);

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {

        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStation() {

        radio.setLastStation(12);

        int expected = 12;
        int actual = radio.getLastStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetFirstStation() {

        radio.setFirstStation(0);

        int expected = 0;
        int actual = radio.getFirstStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddOneNewStation() {
        Radio stations = new Radio(13);

        int expected = 12;
        int actual = stations.getLastStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThanTenNewStations() {
        Radio stations = new Radio(26);

        int expected = 25;
        int actual = stations.getLastStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThanHundredNewStations() {
        Radio stations = new Radio(108);

        int expected = 107;
        int actual = stations.getLastStation();

        Assertions.assertEquals(expected, actual);
    }


}