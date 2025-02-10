package org.ies.archivosyprogramas.components.random;

import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.models.archivo.Archive;
import org.ies.archivosyprogramas.models.archivo.Audio;
import org.ies.archivosyprogramas.models.archivo.Image;
import org.ies.archivosyprogramas.models.archivo.Text;

import java.util.Random;

public class RandomReaderArchive implements Reader<Archive> {
    private final Random random;
    private final Reader<Text> textReader;
    private final Reader<Image> imageReader;
    private final Reader<Audio> audioReader;

    public RandomReaderArchive(Random random, Reader<Text> textReader, Reader<Image> imageReader, Reader<Audio> audioReader) {
        this.random = random;
        this.textReader = textReader;
        this.imageReader = imageReader;
        this.audioReader = audioReader;
    }

    private static final String[] PATH = {
            "/home/etc", "/home/manolo", "/", "/home/manolo/descargas", "/home/manolo/imagenes", "/home/documentos",
            "/home/laima", "/home/laima/etc", "/home/laima/descargas", "/home/laima/imagenes", "/home/documentos"
    };


    @Override
    public Archive read() {
        int choice = random.nextInt(1, 3);
        if (choice == 1) {
            return textReader.read();
        } else if (choice == 2) {
            return imageReader.read();
        } else if (choice == 3) {
            return audioReader.read();
        }
        return null;
    }
}
