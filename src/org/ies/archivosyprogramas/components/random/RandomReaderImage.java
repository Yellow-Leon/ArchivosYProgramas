package org.ies.archivosyprogramas.components.random;

import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.models.archivo.Image;

import java.util.Random;

public class RandomReaderImage implements Reader<Image> {
    private final Random random;

    public RandomReaderImage(Random random) {
        this.random = random;
    }

    private static final String[] PATH = {
            "/home/etc", "/home/manolo", "/", "/home/manolo/descargas", "/home/manolo/imagenes", "/home/documentos",
            "/home/laima", "/home/laima/etc", "/home/laima/descargas", "/home/laima/imagenes", "/home/documentos"
    };


    @Override
    public Image read() {
        return new Image(
                random.nextInt(1000),
                PATH[random.nextInt(PATH.length)],
                random.nextInt(500),
                random.nextInt(500)
        );
    }
}
