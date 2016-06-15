package adapter;

public class AppleClassAdapter extends Orange implements Apple {

    @Override
    public void printColor(String nameColor) {
        printOrangeColor(nameColor);
    }
}
