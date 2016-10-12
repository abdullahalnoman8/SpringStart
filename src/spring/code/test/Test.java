package spring.code.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gazi_opu on 10/10/2016.
 */
public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/code/test/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.setMessage("Spring is Running here....");
        System.out.println(hello.getMessage());


        Employee employee = (Employee) context.getBean("emp");

        employee.show();

        Employee empObj = (Employee) context.getBean("obj");
        empObj.display();
    }
}
