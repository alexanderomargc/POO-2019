package mx.uv.fiee.iinf.poo.demos.genericmethoddemo;

import java.util.ArrayList;

public class Utilities {
    
    public static <T> void fill (ArrayList<T> list, T val) {
        for (int i = 0; i < list.size (); i++) {
            list.set (i, val);
        }
    }
    
    public static <T, U> Double multiply (ArrayList<T> list, U val) {
        Double result = 0.0;
        
        for (int i = 0; i < list.size (); i++) {
            Double bar = ((Number) list.get (i)).doubleValue ();
            Double foo = ((Number) val).doubleValue ();
            
            result += (bar * foo);
        }
        
        return result;
    }
    
}
