package adapter;

public class AppleObjectAdapter implements Apple {

    Orange orange;

    public AppleObjectAdapter(Orange orange) {
        this.orange = orange;
    }

    @Override
    public void printColor(String nameColor) {
        orange.printOrangeColor(nameColor);
    }
}
