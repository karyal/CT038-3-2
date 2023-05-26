package week6;

public class Class1Test {
    public static void main(String []args){
        Class1 obj11, obj12, obj13;
        
        obj11 = new Class1();
        obj11.setNum1(45);
        System.out.println(obj11.getNum1());
        System.out.println(obj11);
        
        obj12 = new Class1(87);
        System.out.println(obj11.getNum1());
        obj12.setNum1(23);
        System.out.println(obj11.getNum1());
        System.out.println(obj11);
        
        obj13 = obj11;
        System.out.println(obj13);
        obj13.setNum1(67);
        System.out.println(obj13);
        System.out.println(obj11);
        
        
    }
}
