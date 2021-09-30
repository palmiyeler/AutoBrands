public class CarBrands {

    private int horsePower = 60;
    private String color = "White";
    private int km = 150000;
    private int passenger = 4;
    private String form = "Sedan";
    private String[] forms = {"Sedan", "Cabrio", "Coupe", "Station", "Sport", "Suv"};
    private String status = "Second hand";



    public CarBrands() {              //CarBrands uzerinden nesne olusturulmasini istemiyorum??

    }


    public void setSerialNUmber(int serialNUmber){

    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getForms(int i) {     //sadece genel class icerinde bulunmasini, obje uzerinde-attribute olarak olmasini istemiyorum,
        return forms[i];
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower > 0) this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if (km > 0) this.km = km;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        if (passenger >= 2 && passenger <= 7) this.passenger = passenger;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        for (String compared : forms) {
            if (form.equalsIgnoreCase(compared)) {
                this.form = form;
                break;
            }
        }
    }
}
