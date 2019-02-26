package mx.uv.fiee.iinf.poo.demos.genericclassdemo;

public class EntryPoint {
    
    public static void main (String [] args) {
        ObjectList myObjectList = new ObjectList ();
        myObjectList.add (1);
        myObjectList.add (new Integer (10));
        myObjectList.add (new Student ("Obiwan"));
        
        System.out.println (myObjectList.get (0));
        System.out.println (myObjectList.get (2));

        
        GenericList<Integer> myGenericList = new GenericList<> ();
        myGenericList.add (1);
        myGenericList.add (new Integer (2));
        
        System.out.println (myGenericList.get (0));
        System.out.println (myGenericList.get (1));
    }
    
}