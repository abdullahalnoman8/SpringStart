package spring.code.test;

/**
 * Created by gazi_opu on 10/12/2016.
 */
public class Employee {
    private int id;
    private String name;
    private String city;
    private Address address;
    /*--------------------------- Constructor -------------------------*/

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }
    public Employee(){
        System.out.println("Default Constructor .....");
    }

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void show(){
        System.out.println(id + " : " + name);
        System.out.println(address.toString());
    }
    public void display(){
        System.out.println(id+ " : " + name + " : " + city);

    }
    /*----------------- Getters and Setters ---------------------------*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
