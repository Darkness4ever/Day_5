import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by mahapata on 7/10/2017.
 */
public class LinkL {
    public  static  void  main(String []args) {
        HashSet<String> ob=new HashSet<>();
        ob.add("One");
        ob.add("Two");
        ob.add("Three");
        LinkedList l=new LinkedList(ob);
//        l.addAll(ob);
        ListIterator li=l.listIterator(ob.size());
        while (li.hasPrevious()){
            System.out.println((String)li.previous());
        }
    }
}
