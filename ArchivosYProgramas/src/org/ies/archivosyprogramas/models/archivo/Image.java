package org.ies.archivosyprogramas.models.archivo;

import java.util.Objects;

public class Image extends Archive{
    private int width;
    private int height;

    public Image(int size, String path, int width, int height) {
        super(size, path);
        this.width = width;
        this.height = height;
    }

    @Override
    public void open() {
        showComun();
        System.out.println("Tipo de archivo = Imagen" + " " + "width = " + width + "" + "height = " + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Image image = (Image) o;
        return width == image.width && height == image.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    @Override
    public String toString() {
        return "Image{" +
                "width=" + width +
                ", height=" + height +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}