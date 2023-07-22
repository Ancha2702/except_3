package exept3;

public class Main {
    public static void main(String[] args) {
        UserInterface<View> myprog = new UserInterface<>(new DataView());
        myprog.start();
    }
}
