public class Ferrari extends CarBrands {

    private boolean seatHeater = true;
    private boolean speedLock = false;
    private boolean autoTransmission = true;

    public Ferrari(int serialNumber, String status) {
        super(serialNumber, status);
    }

    @Override
    public void setForm(String form) {
        if (form.equalsIgnoreCase(getForms(1)) || form.equalsIgnoreCase(getForms(2)) || form.equalsIgnoreCase(getForms(4)))
            super.setForm(form);
    }

    public boolean isSeatHeater() {
        return seatHeater;
    }

    public void setSeatHeater(boolean seatHeater) {
        this.seatHeater = seatHeater;
    }

    public boolean isSpeedLock(){
        return this.speedLock;
    }

    public void setSpeedLock(boolean speedLock){
        this.speedLock = speedLock;
    }

    public boolean isAutoTransmission(){
        return autoTransmission;
    }

}
