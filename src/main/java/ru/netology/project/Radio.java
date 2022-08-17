package ru.netology.project;

public class Radio {

    public int currentStation;
    public int currentVolume;
    public int firstStation;
    public int lastStation;
    public int minVolume;
    public int maxVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > lastStation) {
            return;
        }
        if (newCurrentStation < firstStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation >= lastStation) {
            setCurrentStation(firstStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= firstStation) {
            setCurrentStation(lastStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

        public void chooseCurrentStation(int currentStation) {
            if (currentStation > lastStation) {
                this.currentStation = lastStation;
            } else
            if (currentStation < firstStation) {
                this.currentStation = firstStation;
            } else {
                this.currentStation = currentStation;
            }
        }
    }

