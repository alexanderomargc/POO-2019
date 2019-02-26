package mx.uv.fiee.iinf.poo.demos.genericclassdemo;

import java.util.ArrayList;

public class GenericList<T> {
    private ArrayList<T> container = new ArrayList<> ();
    
    public void add (T item) {
        container.add (item);
    }
    
    public T get (int index) {
        return container.get (index);
    }
}
