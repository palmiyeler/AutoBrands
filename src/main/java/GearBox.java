public class GearBox {

    private double[] gearRatio={2.97, 2.07, 1.43, 1.00, 0.84, 0.56, -3.38};
    private int currentGear;

    public GearBox(){

    }

    public int getCurrentGear(){
        return this.currentGear;
    }

    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
    }

    public double getGearRatio(int currentGear){
        if(currentGear<gearRatio.length) return this.gearRatio[currentGear-1];
        else return 0;
    }


    public void shiftUp(){
        if(getCurrentGear() < gearRatio.length ) {
            setCurrentGear(getCurrentGear() + 1);
            System.out.println("Shifted up!");
        } else System.out.println("Gear at max!!");
    }

    public void shiftDown(){
        if(getCurrentGear() > 0 ) {
            setCurrentGear(getCurrentGear() + 1);
            System.out.println("Shifted up!");
        } else System.out.println("Gear at min!!");
    }


}
