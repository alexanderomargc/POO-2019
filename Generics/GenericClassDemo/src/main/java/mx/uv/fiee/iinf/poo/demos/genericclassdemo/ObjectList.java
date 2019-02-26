package mx.uv.fiee.iinf.poo.demos.genericclassdemo;

import java.util.ArrayList;

public class ObjectList {
    private ArrayList container = new ArrayList ();
    
    public void add (Object item) {
        container.add (item);
    }
    
    public Object get (int index) {
        return container.get (index);
    }
}
