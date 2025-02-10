package org.ies.archivosyprogramas.components.random;

import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.models.archivo.Image;
import org.ies.archivosyprogramas.models.archivo.Text;

import java.util.Random;

public class RandomReaderText implements Reader<Text> {
    private final Random random;

    public RandomReaderText(Random random) {
        this.random = random;
    }

    private static final String[] PATH = {
            "/home/etc", "/home/manolo", "/", "/home/manolo/descargas", "/home/manolo/imagenes", "/home/documentos",
            "/home/laima", "/home/laima/etc", "/home/laima/descargas", "/home/laima/imagenes", "/home/documentos"
    };

    private static final String[] TEXT = {
            "Ee", "Fe", "aarar", "AFGWAEFA", "EAEA", "WWWW",
            "Aa", "Descripcion", "Leaving all behind", "Having a wonderful time", "Playing in the sunshine"
    };


    @Override
    public Text read() {
        return new Text(
                random.nextInt(1000),
                PATH[random.nextInt(PATH.length)],
                TEXT[random.nextInt(TEXT.length)]
        );
    }
}
