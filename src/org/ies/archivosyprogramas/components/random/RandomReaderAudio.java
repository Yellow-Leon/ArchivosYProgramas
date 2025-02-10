package org.ies.archivosyprogramas.components.random;

import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.models.archivo.Audio;
import org.ies.archivosyprogramas.models.archivo.Text;

import java.util.Random;

public class RandomReaderAudio implements Reader<Audio> {
    private final Random random;

    public RandomReaderAudio(Random random) {
        this.random = random;
    }

    private static final String[] PATH = {
            "/home/etc", "/home/manolo", "/", "/home/manolo/descargas", "/home/manolo/imagenes", "/home/documentos",
            "/home/laima", "/home/laima/etc", "/home/laima/descargas", "/home/laima/imagenes", "/home/documentos"
    };


    @Override
    public Audio read() {
        return new Audio(
                random.nextInt(1000),
                PATH[random.nextInt(PATH.length)],
                random.nextDouble(10.00)
        );
    }
}
