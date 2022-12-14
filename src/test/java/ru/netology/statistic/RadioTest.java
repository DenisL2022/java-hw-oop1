package ru.netology.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio radio;
    @BeforeEach
    void setUp(){
        radio = new Radio();
    }

    @Test
    void constructorTest(){
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void increaseVolumeTest(){
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
        for(int i = 0; i < 11; i++){
            radio.increaseVolume();
        }
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeTest(){
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        for(int i = 0; i < 11; i++){
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void nextStationTest(){
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());

        for(int i = 0; i < 11; i++){
            radio.nextStation();
        }
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void prevStationTest(){
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void setStationTest(){
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
        radio.setCurrentStation(11);
        assertEquals(7, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(7, radio.getCurrentStation());
    }
}