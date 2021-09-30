public class Engine {

    private int numOfCylinders = 4;
    private float capacity = (float) 1.6;
    private boolean start = false;
    private boolean brake = false;


    public Engine(int numOfCylinders, float capacity){
        setNumOfCylinders(numOfCylinders);
        setCapacity(capacity);
    }

    public int getNumOfCylinders(){
        return this.numOfCylinders;
    }

    public void setNumOfCylinders(int numOfCylinders){
        this.numOfCylinders = numOfCylinders;
    }

    public float getCapacity(){
        return this.capacity;
    }

    public void setCapacity(float capacity){
        this.capacity = capacity;
    }

    public boolean start(){
        System.out.println("Engine is started.");   // baglamis oldugumuz arabanin ismini cikartabilir miyiz???
        this.start = true;
        return start;
    }                                               //(car + "is started") gibi??

    public void accelerate(){
        System.out.println("accelerating...");
    }

    public boolean brake(){
        System.out.println("Brake is used!");
        return true;
    }

}
