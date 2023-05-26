package week5.task1;

public class Class4 extends Class1{
    private int num2;
    
    public Class4(){
        super();
        this.num2=0;
    }
    public Class4(int num1, int num2){
        super(num1);
        this.num2=num2;
    }
    
    @Override
    public void setNum1(int num1){
        super.setNum1(num1);
    }
    
    public void setNum2(int num2){
        this.num2=num2;
    }
    @Override
    public int getNum1(){
        return super.getNum1();
    }
    public int getNum2(){
        return this.num2;
    }
    @Override
    public String toString(){
        return super.toString()+", "+this.num2;
    }
}