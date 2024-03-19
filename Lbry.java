// Courtesy of clandaverde

public class Lbry {
    public static void clearCon() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
