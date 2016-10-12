package ci;

/**
 * Created by gazi_opu on 10/12/2016.
 */
public class Answer {
    private int id;
    private String name;
    private String by;

    public Answer(int id, String name, String by) {
        this.id = id;
        this.name = name;
        this.by = by;
    }

    @Override
    public String toString() {
        return id + " " +name + " " +by;
    }
}
