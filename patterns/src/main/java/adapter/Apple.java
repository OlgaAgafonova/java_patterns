package adapter;

public interface Apple {

    default public void printColor(String nameColor) {
        System.out.println("Apple color is: " + nameColor);
    }
}
