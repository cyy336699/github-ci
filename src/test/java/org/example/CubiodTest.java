package org.example;

import static org.junit.Assert.*;

public class CubiodTest {
    private Cubiod cubiod = new Cubiod(4, 5, 6);

    @org.junit.Test
    public void getVolume() {
        assertEquals(120, cubiod.getVolume(), 1e-5);
        cubiod.setHeight(10);
        cubiod.setLength(10);
        cubiod.setWidth(10);
        assertEquals(1000, cubiod.getVolume(), 1e-5);
    }

    @org.junit.Test
    public void setLength() {
        cubiod.setLength(10);
        assertEquals(10, cubiod.getLength(), 1e-5);
        cubiod.setLength(8);
        assertEquals(8, cubiod.getLength(), 1e-5);
    }

    @org.junit.Test
    public void setWidth() {
        cubiod.setWidth(10);
        assertEquals(10, cubiod.getWidth(), 1e-5);
        cubiod.setWidth(8);
        assertEquals(8, cubiod.getWidth(), 1e-5);
    }

    @org.junit.Test
    public void setHeight() {
        cubiod.setHeight(10);
        assertEquals(10, cubiod.getHeight(), 1e-5);
        cubiod.setHeight(8);
        assertEquals(8, cubiod.getHeight(), 1e-5);
    }
}