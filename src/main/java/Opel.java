public class Opel extends CarBrands {

    private boolean autoTransmission = false;

    public Opel(int serialNumber, String status) {
        super(serialNumber, status);
    }

    @Override
    public void setHorsePower(int horsePower) {
        if(horsePower<150) super.setHorsePower(horsePower);
    }

    public boolean isAutoTransmission(){
        return autoTransmission;
    }
}
