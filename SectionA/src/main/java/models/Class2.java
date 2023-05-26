package models;

public class Class2 {
    private int num1;//instance variable
    private int num2;
    private int num3;
    
    //default constructor
    public Class2(){ //special method which set default 
                     // value to instance variable
        this.num1=-1;
        this.num2=-2;
        this.num3=-3;
    }
    //Setter
    public void setNum1(int num1){
        this.num1=num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public void setNum3(int num3){
        this.num3=num3;
    }
    //Getter
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public int getNum3(){
        return this.num3;
    }
    public String toString(){
        return this.num1+", "+this.num2+", "+this.num3;
    }
}




