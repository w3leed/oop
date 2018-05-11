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
public class Profes extends Person {

    private Student[] StudentList;
    int nstudent;
    int num;

//    public Profes() {
//        num = 5;
//        this.StudentList = new Student[num];
//
//    }

    public Profes(String b, int m) {

        super(b, m);
        nstudent =0;

    }

    public void registerStudent(Student s) {

        //to regestar this
        //StudentList[++c]=s;
        //or this
        StudentList[++nstudent] = s;
        

    }

    public int total() {
        int d = 0;
        //الكونت لحد العدد المسجلين من الطلاب
        for (int i = 0; i < nstudent; i++) {
         //هستدعى الورق بالاستيدنت لست
            d += this.StudentList[i].NPapers();
        }
        return d;
    }

}
 