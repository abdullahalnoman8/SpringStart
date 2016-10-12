package spring.code.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ci.Question;

/**
 * Created by gazi_opu on 10/10/2016.
 */
public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/code/test/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.setMessage("Spring is Running here....");
        System.out.println(hello.getMessage());


        System.out.println("---------------------- Simple Initialization with Object Reference  ------------------------");
        Employee employee = (Employee) context.getBean("emp");
        employee.show();

        System.out.println("---------------------- Now Simple Initialization  ------------------------");
        Employee empObj = (Employee) context.getBean("obj");
        empObj.display();

        /*------------------- Question(List implementation) --------------- */
        Question q = (Question) context.getBean("qstion");
        System.out.println("---------------------- Now List ------------------------");
        q.displayInfo();
    }
}
