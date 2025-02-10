package org.ies.archivosyprogramas.models.archivo;

import java.util.Objects;

public class Text extends Archive {
    private String text;

    public Text(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    @Override
    public void open() {
        showComun();
        System.out.println("Tipo de archivo = texto" + " " + "texto = " + text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Text text = (Text) o;
        return Objects.equals(this.text, text.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return "Texto{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
