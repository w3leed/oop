/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assament_3_extends;

/**
 *
 * @author AWYEL
 */
public class Student extends Person{
private int  nPapers;
 public Student()
 {}
    public Student(String n, int d,int np) {
        super(n, d);
        nPapers=np;
    }
    
    public int NPapers(){
        return this.nPapers;
    }
    
}
