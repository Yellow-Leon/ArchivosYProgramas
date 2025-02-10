package org.ies.archivosyprogramas.models.archivo;

import java.util.Objects;
import java.util.Scanner;

public abstract class Archive {
    protected int size;
    protected String path;

    public Archive(int size, String path) {
        this.size = size;
        this.path = path;
    }

    public void showComun(){
        System.out.println(
                    " size= " + size +
                    ", path='" + path + '\'' +
                    '}');
    }

    public abstract void open();

    public void displayMsg(){
        System.out.println("Introduzca la nueva ruta");
    }

    public String askNewPath(){
        Scanner scanner = new Scanner(System.in);
        displayMsg();
        return scanner.nextLine();
    }

    public void move(String newPath){
        if (newPath == null){
            System.out.println("La nueva ruta es nula");
        } else if (newPath.equals(path)) {
            System.out.println("No hay cambios");
        } else {
            path = newPath;
            System.out.println("Se ha movido fichero a " + newPath);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Archive archive = (Archive) o;
        return size == archive.size && Objects.equals(path, archive.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, path);
    }
}