package week5;

public class Class3 {
    private int num1;
    
    public Class3(){
        this.num1=0;
    }
    
    public Class3(int num1){
        this.num1=num1;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }
    public int getNum1(){
       return this.num1;
    }
    public void increase(){
        this.num1++;
    }
    public void decrease(){
        this.num1--;
    }
    public String toString(){
        return this.num1+" ";
    }
}
