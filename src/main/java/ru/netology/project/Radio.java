package ru.netology.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int firstStation = 0;
    private int lastStation = 12;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int newStationAdded) {
        this.currentStation = newStationAdded;
        lastStation = newStationAdded - 1;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > lastStation) {
            return;
        }
        if (currentStation < firstStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void chooseNextStation() {
        if (currentStation >= lastStation) {
            setCurrentStation(firstStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }
        public void choosePreviousStation() {
            if(currentStation <= firstStation) {
                setCurrentStation(lastStation);
            } else {
                setCurrentStation(currentStation - 1);
            }
        }

        public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
        }

        public void volumeUp() {
        setCurrentVolume(currentVolume + 1);
        }

        public void volumeDown() {
        setCurrentVolume(currentVolume - 1);
        }
    }
