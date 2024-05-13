import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Thread thread;
        int allWord = 0;

        for(int i = 0; i < 20; i++){
            FileManipulator obj = new FileManipulator(new File("src/Multi_threading_workshop_9/file_" + i + ".txt"));

        }
    }
}