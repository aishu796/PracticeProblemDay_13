package com.linkedlist.java;
import java.util.Hashtable;
import java.util.Map;

public class StudentMain
{
    public static void main(String[] args) {
        Map<Integer,Student> h=new Hashtable<>();
        Student s1=new Student(1,"Aishu","CSN","Aishu@gmail.com");
        Student s2=new Student(2,"raju","CSN","raju@gmail.com");
        Student s3=new Student(3,"isha","CSN","isha@gmail.com");
        h.put(4,s1);
        h.put(5,s2);
        h.put(6,s3);
        h.put(s1.getId(),s1);
        h.put(s2.getId(),s2);
        h.put(s3.getId(),s3);
        for(Map.Entry<Integer,Student>val:h.entrySet())
        {
            int stdid=val.getKey();
            Student st=val.getValue();
            System.out.println("Student id"+stdid+"Student Name"+st.getName()+"student address"+st.getAddress()+"student email"+st.getEmail());
        }
//        int stdid=1;
//        Student std=h.get(stdid);
//        if(std!=null)
//        {
//            System.out.println(stdid);
//            System.out.println(std.getName());
//            System.out.println(std.getaddress());
//            System.out.println(std.getemail());
//        }
//        else {
//            System.out.println("Student id is not found"+stdid);
//        }




    }
}
