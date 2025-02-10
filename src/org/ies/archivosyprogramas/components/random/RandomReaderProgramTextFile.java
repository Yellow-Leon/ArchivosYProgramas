package org.ies.archivosyprogramas.components.random;

import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.models.Program;
import org.ies.archivosyprogramas.models.archivo.Archive;
import org.ies.archivosyprogramas.models.archivo.Text;

import java.util.Random;

public class RandomReaderProgramTextFile<T extends Archive> implements Reader<Program<T>> {
    private final Random random;
    private final Reader<Text> textReader;

    public RandomReaderProgramTextFile(Random random, Reader<Text> textReader) {
        this.random = random;
        this.textReader = textReader;
    }

    private static final String[] NAMES = {"TERMINATOR", "CHATGPT", "DEEPSEEK", "ORDENATOR", "ORGANIZATOR"};

    @Override
    public Program<T> read() {
        T[] archives = (T[]) new Archive[random.nextInt(2,20)];
        for (int i = 0; i < archives.length; i++) {
            archives[i]= (T) textReader.read();
        }

        return new Program<T>(
                NAMES[random.nextInt(NAMES.length)],
                archives
        );
    }
}
