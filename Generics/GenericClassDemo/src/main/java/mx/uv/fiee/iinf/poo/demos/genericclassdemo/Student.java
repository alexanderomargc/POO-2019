package mx.uv.fiee.iinf.poo.demos.genericclassdemo;

/**
 *
 * @author Gonzalo
 */
public class Student {
    private String _name;
    
    public Student (String name) {
        _name = name;
    }
    
    public String getStudent () {
        return this._name;
    }
    
    public String toString () {
        return this._name;
    }
}
