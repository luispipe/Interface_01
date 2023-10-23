package com.example.interfaceejemplo_01;

public interface GPS {
    /*Una interface es una estructura abstracta por lo que
    * todos sus metodos son abstractos
    *
    * El uso de interface es para definir plantillas
    * */

    final String NOMBRE="GPS Luis";

    public double obtenerLatitud();
    public double obtenerLongitud();
    public void obtenerCoodenadas(double latitud, double longitud);


}
