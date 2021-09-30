public class CarModel {

    String title;                   //belli bir model oluşturulduğunda hep aynı aracın üretilmesini istiyorum.
    Car car;

    public CarModel(Car myCar) {
        this.car = myCar;
    }

    public CarModel(String title){
        setTitle(title);
    }

    private void setTitle(String title){
        this.title = title;
    }

    public void setCar(Car myCar){
        this.car = myCar;
    }

    public Car getCar(){
        return this.car;
    }

}
