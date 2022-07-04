package domain;
public class Radio {


        private int currentVolume;
        int currentStation;

    public Radio() {

    }


    public void increaseVolume(){
            if (currentVolume <10){
                currentVolume++;
            }

        }

        public void decreaseVolume(){
            if (currentVolume>0){
                currentVolume--;
            }
        }

        public void nextStation(){
            if (currentStation<9){
                currentStation++;
            }else {
                currentStation=0;
            }
        }



        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
            if (currentVolume<0){
                return;
            }
            if (currentVolume>10){
                return;
            }
            this.currentVolume = currentVolume;
        }

        public int getCurrentStation() {
            return currentStation;
        }

        public void setCurrentStation(int currentStation) {
            if (currentStation<0){
                return;
            }
            if (currentStation>9){
                return;
            }
            this.currentStation = currentStation;
        }
    }


