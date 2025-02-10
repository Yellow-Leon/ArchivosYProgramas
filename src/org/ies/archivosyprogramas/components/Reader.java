package org.ies.archivosyprogramas.components;

import org.ies.archivosyprogramas.models.archivo.Archive;

public interface Reader <T>{
    T read();
}
