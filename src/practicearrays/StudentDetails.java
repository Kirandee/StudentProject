/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicearrays;

/**
 *
 * @author Hp
 */
public class StudentDetails {
    public static void main(String[] args){
        Student[] list=new Student[3]; // array of object declaration
    Student s1 = new Student();
    s1.setName("Kiran");
    s1.setId(234);
     Student s2 = new Student();
    s2.setName("Han");
    s2.setId(567);
     Student s3 = new Student();
    s3.setName("aman");
    s3.setId(56117);
    list[0]=s1;
    list[1]=s2;
    list[2]=s3;
    for(int i=0; i<list.length; i++){
    System.out.println(list[i].getName() + " " +list[i].getId());
    }
    
    }
}
