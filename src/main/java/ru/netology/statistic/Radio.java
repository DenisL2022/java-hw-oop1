package ru.netology.statistic;

public class Radio {
    private int maxStation;
    private int maxVolume = 100;
    private int currentStation = 0;
    private int currentVolume = 0;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {
        maxStation = 10;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation()
    {
        if (++currentStation == maxStation){
            currentStation = 0;
            return;
        }
    }

    public void prevStation(){
        if (--currentStation <= 0){
            currentStation = maxStation - 1;
            return;
        }
    }

    public void setCurrentStation(int currentStation){
        if (currentStation >= maxStation || currentStation < 0){
            return;
        }
        this.currentStation = currentStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
