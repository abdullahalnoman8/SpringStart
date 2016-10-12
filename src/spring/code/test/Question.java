package spring.code.test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by gazi_opu on 10/12/2016.
 */
public class Question {
    private int id;
    private String name;
    private List<String> answers;

    public Question(int id, String name, List<String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo(){
        System.out.println(id + " " +name);
        System.out.println("Answers are ");
        Iterator<String> itr = answers.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
