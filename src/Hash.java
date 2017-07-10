import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by mahapata on 7/10/2017.
 */

class V {
    private String make;
    private String model;
    private  long unit;
    private  double price;


    V(String make, String model, long unit, double price) {
        this.make = make;
        this.model = model;
        this.unit = unit;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String toString() {
        return make+model+unit+price;
    }
//
//    public int hashCode(){
//        return this.hashCode();
//    }
}
public class Hash {
    public static void main(String  []args) {
        V ob1=new V("abc","as",2,3);
        V ob2 = new V("abc","as",2,3);
        int n=ob1.hashCode();
        HashSet<V> ob=new HashSet<V>();
        ob.add(ob1);
        ob.add(ob1);

        double d=9;
//        int n=(int) d;

        Iterator i=ob.iterator();
        for(;i.hasNext();){
            System.out.println(i.next());
        }
    }
}
