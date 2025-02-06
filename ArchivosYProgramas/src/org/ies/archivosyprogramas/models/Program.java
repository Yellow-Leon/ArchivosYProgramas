package org.ies.archivosyprogramas.models;

import org.ies.archivosyprogramas.models.archivo.Archive;

public class Program {
    private String name;
    private Archive[] archives;

    public Program(String name, Archive[] archives) {
        this.name = name;
        this.archives = archives;
    }

    public void execute(String outputPath){
        System.out.println(name);
        for (var archive: archives){
            System.out.println(archive);
            archive.move(outputPath);
        }
    }
}