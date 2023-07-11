package Class_02;

public class MyCounterTest2 {
    public static void main(String[] args)
    {
        MyCounter obj = new MyCounter();

        System.out.println("obj.value = "+ obj.value);
        obj.inc(obj.value);
        System.out.println("obj.value = " + obj.value);
    }
}
