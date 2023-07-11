package Class_02;

public class sCarTest {
    public static void main(String[] args)
    {
        sCar c1 = new sCar("S600", "white", 80);
        sCar c2 = new sCar("E500", "blue", 20);

        int n = sCar.numbers;
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}
