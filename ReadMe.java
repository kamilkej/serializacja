import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadMe {
    public static void main(String[] args) {

        String fileName = "player1.txt";
        Player player1;

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            player1 = (Player) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException e) {
            e.printStackTrace();
            return;

        } catch (ClassNotFoundException c) {

            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        System.out.println(player1);
    }
}