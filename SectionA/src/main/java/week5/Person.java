package week5;

public class Person {
    private int pid;
    private String name;
    private String address;
    //Constructors
    public Person(){
        this.pid=0;
        this.name="";
        this.address="";
    }
    public Person(int pid, String name, String address){
        this.pid=pid;
        this.name=name;
        this.address=address;
    }
    //setters
    public void setPID(int pid){
        this.pid=pid;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    //getters
    public int getPID(){
        return this.pid;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    //toStrings
    public String toString(){
        return this.pid+", "+this.name+", "+this.address;
    }
}