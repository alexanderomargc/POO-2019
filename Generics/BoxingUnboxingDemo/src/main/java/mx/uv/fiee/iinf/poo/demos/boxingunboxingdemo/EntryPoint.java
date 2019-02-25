package mx.uv.fiee.iinf.poo.demos.boxingunboxingdemo;

import java.util.ArrayList;

public class EntryPoint {
    
    public static void main (String [] args) {
        
        ArrayList ar = new ArrayList ();
        ar.add (1);
        ar.add (2);
        ar.add (3);
        ar.add (4);
        ar.add (5);
        ar.add (6);
        ar.add (7);
        ar.add (8);
        ar.add (9);
        ar.add (10);
        
        for (int i = 0; i < ar.size (); i++) {
            System.out.println (ar.get (i));
        }
        
//        ArrayList ar2 = new ArrayList ();
//        ar2.add (new Student ("Tyrion"));
//        ar2.add (new Student ("Daenarys"));
//        ar2.add (new Student ("Cersei"));
//        ar2.add (new Student ("John"));
//        ar2.add (new Student ("Sansa"));
//        ar2.add (new Student ("Jaime"));
//        ar2.add (new Student ("Arya"));
//        ar2.add (new Student ("Bran"));
//        
//        for (int i = 0; i < ar2.size (); i++) {
//            System.out.println (ar2.get (i));
//        }
    }
    
}

//class Student {
//    private String _name;
//    
//    public Student (String name) {
//        _name = name;
//    }
//    
//    public String getStudent () {
//        return this._name;
//    }
//}

