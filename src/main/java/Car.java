public class Car {

    private int registrationNumber;
    private int yearOfManufacture;
    private String licenseNumber;
    Engine engine;
    Brake brake;
    boolean brakeAsk = false;

    public Car(int registrationNumber, int yearOfManufacture, Engine engine) {
        setRegistrationNumber(registrationNumber);
        setYearOfManufacture(yearOfManufacture);
        setEngine(engine);
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBrake(Brake brake){
        this.brake = brake;
        this.brakeAsk = true;
    }

    public boolean isBrake(){
        return this.brakeAsk;
    }


    public int getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void moveForward() {
        System.out.println("car with plate " + getLicenseNumber() + ", is going forward.");
    }

    public void moveBackward() {
        System.out.println("car with plate " + getLicenseNumber() + ", is going backward.");
    }

    public void turnRight() {
        System.out.println("car with plate " + getLicenseNumber() + ", is turning right.");
    }

    public void turnLeft() {
        System.out.println("car with plate " + getLicenseNumber() + ", is turning left.");
    }

    public void stop() {
        System.out.println("car with plate " + getLicenseNumber() + ", is stopped.");
    }

}
