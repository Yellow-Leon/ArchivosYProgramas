package org.ies.archivosyprogramas.models.archivo;

import java.util.Objects;

public class Audio extends Archive{
    private double duration;

    public Audio(int size, String path, double duration) {
        super(size, path);
        this.duration = duration;
    }

    @Override
    public void open() {
        showComun();
        System.out.println("Tipo de archivo = Audio" + " " + "duration = " + duration);
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return Double.compare(duration, audio.duration) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}