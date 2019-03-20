import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaIOTester {


    public static void main(String[] args) {
        example1();
    }

    private static void example1() {

        String someData = "The capital of New York is Albany";
        String fileName = "NewYorkCapital";
        Path path = Paths.get("/home/jake/Tutoring/src/Students/" + fileName);

        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Files.writeString(path, someData);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

