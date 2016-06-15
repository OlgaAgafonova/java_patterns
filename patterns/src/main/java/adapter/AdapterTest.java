package adapter;

public class AdapterTest {

    public static void main(String[] args){
        Apple apple = new Apple() {};
        apple.printColor("white");

        apple = new AppleClassAdapter();
        apple.printColor("green");

        apple = new AppleObjectAdapter(new Orange());
        apple.printColor("red");
    }




}
