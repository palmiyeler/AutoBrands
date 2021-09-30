public class Production {

    public static void main(String[] args) {
        Engine myEngine = new Engine(6, (float)3.5);
        Brake myBrake = new Brake();
        Car myCar = new Car(1,2020, myEngine);
        System.out.println(myCar.isBrake());
        myCar.setBrake(myBrake);
        System.out.println(myCar.isBrake());


        CarModel passat = new CarModel(myCar);
        passat.getCar().getEngine().setNumOfCylinders(4);           //yaptigimda asil enginede degisiklik yapiyor.
        myCar.setLicenseNumber("UL M 5");
        //passat.setCar(myCar);                       //ikinci araci nasil uretilecek???
        myCar.setLicenseNumber("A A 1");



    }
}
