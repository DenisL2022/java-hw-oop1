package ru.netology.statistic;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;

    public void increaseVolume() {
        if (currentVolume < 10) {
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
        if (currentStation == 9){
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void prevStation(){
        if (currentStation == 0){
            currentStation = 9;
            return;
        }
        currentStation--;
    }

    public void setCurrentStation(int currentStation){
        if (currentStation > 9 || currentStation < 0){
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
