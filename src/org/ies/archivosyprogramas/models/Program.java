package org.ies.archivosyprogramas.models;

import org.ies.archivosyprogramas.components.Reader;
import org.ies.archivosyprogramas.models.archivo.Archive;

import java.util.Arrays;
import java.util.Objects;

public class Program <T extends Archive>{
    private String name;
    private T[] archives;

    public Program(String name, T[] archives) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T[] getArchives() {
        return archives;
    }

    public void setArchives(T[] archives) {
        this.archives = archives;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program<?> program = (Program<?>) o;
        return Objects.equals(name, program.name) && Objects.deepEquals(archives, program.archives);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(archives));
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", archives=" + Arrays.toString(archives) +
                '}';
    }
}