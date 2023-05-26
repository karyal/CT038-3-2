
package week5.task1;

public class Test {
    public static void main(String []args){
        Class1 obj1=new Class1();
        obj1.setNum1(34);
        System.out.println(obj1.getNum1());
        System.out.println(obj1);
        
        obj1=new Class1(20);
        System.out.println(obj1.getNum1());
        System.out.println(obj1);
        
        Class2 obj2 = new Class2();
        obj2.setNum2(4);
        System.out.println(obj2.getNum2());
        System.out.println(obj2);
        
        Class4 obj41, obj42;
        obj41=new Class4();
        obj41.setNum1(45);
        obj41.setNum2(43);
        obj42=new Class4(67, 21);
        System.out.println(obj41);
        System.out.println(obj42);
    }
}
