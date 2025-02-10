import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.components.random.RandomReaderProgramTextFile;
import org.ies.archivosyprogramas.components.random.RandomReaderText;
import org.ies.archivosyprogramas.models.Program;
import org.ies.archivosyprogramas.models.archivo.Text;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Reader<Text> textReader = new RandomReaderText(random);
        Reader<Program<Text>> programReader = new RandomReaderProgramTextFile<>(random, textReader);

        Program<Text> program = programReader.read();
        String newPath = scanner.nextLine();
        program.execute(newPath);
    }
}