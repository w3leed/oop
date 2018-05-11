/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assament_3_extends;

import java.util.Scanner;

/**
 *
 * @author AWYEL
 */
public class Assament_3_extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//          String ss;
//       // String h="XXX";
//        Scanner in = new Scanner(System.in);
//       
//      
//
//     do
//        
//        { 
//            System.out.println("enter your name");
//        ss = in.next();
//        System.out.println("enter your id");
//        int d = in.nextInt();
//        Person p = new Person(ss,d);
//        
        Profes p = new Profes("waleed", 1);
        p.display();
        System.out.println("*************************");
        Scanner in = new Scanner(System.in);
        System.out.println("enter Student  names");
        String ss = in.next();
        do {
            int id;
            id = in.nextInt();
            int paper;
            paper = in.nextInt();
            Student s1 = new Student(ss, id, paper);
            p.registerStudent(s1);

        } while (ss != "XXX");
        System.out.println("the Npaper  is ::" + p.total());
        System.out.println("***************************");
    
    
    }
}
