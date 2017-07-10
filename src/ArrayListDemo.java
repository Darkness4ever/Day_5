/**
 * Created by mahapata on 7/10/2017.
 */
import java.util.*;

class VechileDemo {
    private String make;
    private String model;
    private long unit;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    VechileDemo(String make, String model, long uni, double price) {
        this.make=make;
        this.model=model;
        this.unit=unit;
        this.price=price;
    }

    public String toString() {

        return make + model + unit + price;
    }


}


public class ArrayListDemo {

    public static void main(String[] args) {
        //List allows duplicate values, stores values in the order given/added
        //Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
        /*ArrayList<String> atmp = new ArrayList<String>();
        atmp.add("hgdf");
        */
        VechileDemo ob1 = new VechileDemo("Rolls Royce", "Wraith", 6, 9.8);
        VechileDemo ob2 = new VechileDemo("Mercedes", "Maybach", 5, 4.5);
        VechileDemo ob3 = new VechileDemo("BMW", "C Class", 3, 2);

        ArrayList<VechileDemo> ao = new ArrayList<>();
        ao.add(ob1);
        ao.add(ob2);
        ao.add(ob3);
        Iterator<VechileDemo> it = ao.iterator();

        for (; it.hasNext(); ) {
            VechileDemo v = it.next();
            System.out.println(v);
        }
    }}

