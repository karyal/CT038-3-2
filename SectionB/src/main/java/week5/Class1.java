package week5;

public class Class1 {
    private int num1;//read & write
    public Class1(){//default
        this.num1=0;
    }
    //setter
    public void setNum1(int num1){
        this.num1=num1;
    }
    //getter
    public int getNum1(){
        return this.num1;
    }
    public String toString(){
        return this.num1+"";
    }
}
