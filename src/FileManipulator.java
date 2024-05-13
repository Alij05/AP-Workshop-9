import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class FileManipulator implements Runnable{
    private Scanner scanner;
    private HashSet<String> fileToList;

    public FileManipulator(File file) throws FileNotFoundException {
        scanner = new Scanner(file);
        fileToList = new HashSet<>();
    }

    @Override
    public void run() {

    }
    public void initialHashset(){
        
    }

    public void maxLength(){

    }


}
