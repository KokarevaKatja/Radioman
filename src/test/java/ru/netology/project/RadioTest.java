package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);

        int expected = 10;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);

        int expected = 10;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeJustAfterNormal() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(6);

        radio.volumeUp();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeJustBeforeNormal() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(6);

        radio.volumeDown();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeDownBelowMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);

        radio.volumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeJustBeforeMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);

        radio.volumeDown();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeJustAfterMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNormalVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);

        radio.setCurrentVolume(14);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(-8);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStation() {
        Radio radio = new Radio();

        radio.setLastStation(9);

        int expected = 9;
        int actual = radio.getLastStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStation() {
        Radio radio = new Radio();

        radio.setFirstStation(0);

        int expected = 0;
        int actual = radio.getFirstStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAfterFirst() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationJustBeforeLast() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNormalStation() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAfterLast() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setCurrentStation(3);

        radio.setCurrentStation(15);

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeFirst() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setCurrentStation(1);

        radio.setCurrentStation(-3);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationJustBeforeFirst() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationJustBeforeNormal() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setCurrentStation(5);

        radio.previousStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationJustAfterNormal() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationJustAfterLast() {
        Radio radio = new Radio();
        radio.setFirstStation(0);
        radio.setLastStation(9);
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseCurrentStationNormal(){
        Radio radio = new Radio();
        radio.setLastStation(9);
        radio.setFirstStation(0);
        radio.setCurrentStation(6);

        radio.chooseCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void chooseCurrentStationAboveLast(){
        Radio radio = new Radio();
        radio.setLastStation(9);
        radio.setFirstStation(0);
        radio.setCurrentStation(5);

        radio.chooseCurrentStation(29);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseCurrentStationBeforeFirst(){
        Radio radio = new Radio();
        radio.setLastStation(9);
        radio.setFirstStation(0);
        radio.setCurrentStation(5);

        radio.chooseCurrentStation(-3);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
