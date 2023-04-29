import java.io.*;

public class Serial {
    public static void main(String[] args) {
        String fileName = "player1.txt";

        Player player1 = new Player("Mario", 100, 70);
        Player player2 = new Player("Luigi", 100, 25);

        player1.useLeft("AXE");
        player2.useRight("WRENCH");

        System.out.println(player1);
        System.out.println(player2);

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(player1);
            out.close();
            file.close();

            System.out.println("KOniec serializacji");

        } catch (IOException i) {
            i.printStackTrace();
        }

        player1 = null;

        System.out.println(player1);
    }
}
