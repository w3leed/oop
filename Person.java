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
public class Person {
    protected String name;
    protected int id;
    public Person(){
    }
    
    public Person(String n,int d){
    name=n;
    id=d;
    
    }
    
    public void display()
    {
        System.out.println("name is :"+name);
        System.out.println("id is ::"+id);
    
    }
}
