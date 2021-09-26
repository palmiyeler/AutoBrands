public class BMW extends CarBrands {

    private boolean seatHeater = true;
    private boolean autoTransmission = false;

    public BMW(int serialNumber, String status) {
        super(serialNumber, status);
    }

    public boolean isSeatHeater() {
        return seatHeater;
    }

    public void setSeatHeater(boolean seatHeater) {
        this.seatHeater = seatHeater;
    }

    public void setAutoTransmission(boolean autoTransmission){
        this.autoTransmission = autoTransmission;
    }

    public boolean isAutoTransmission(){
        return autoTransmission;
    }

}
