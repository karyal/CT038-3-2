package week8.day1;

public class Person {
    private int pid;
    private String name;
    //Constructors
    public Person(){//default ctor
        this.pid=0;
        this.name="";
    }
    public Person(int pid, String name){
        this.pid=pid;
        this.name=name;
    }
    
}
