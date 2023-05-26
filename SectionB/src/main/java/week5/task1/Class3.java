package week5.task1;

public class Class3 extends Class1{
    private int num2;
    public Class3(){
        this.num2=0;
    }
    public Class3(int num2){
        this.num2=num2;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int getNum2(){
        return this.num2;
    }
    public String toString(){
        return this.num2+" ";
    }
}