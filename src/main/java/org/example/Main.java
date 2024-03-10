package org.example;

import org.example.spring.constructorinjection.User;
import org.example.spring.setterinjection.Student;
import org.example.spring.setterinjection.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Setter injection test codes
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);

        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);

        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);


        //constructor injection test codes
        ApplicationContext context1 = new ClassPathXmlApplicationContext("config-ci.xml");
        User user1= (User) context1.getBean("user1");
        System.out.println(user1);

        User user2= (User) context1.getBean("user2");
        System.out.println(user2);

    }
}