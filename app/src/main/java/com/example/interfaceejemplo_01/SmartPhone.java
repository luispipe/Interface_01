package com.example.interfaceejemplo_01;

import java.util.ArrayList;

public class SmartPhone implements GPS,WiFi{
    //Para herededar de interfaces usamos la palabra implements
    //Se permite heredar de n cantidad de interfaces

    @Override
    public double obtenerLatitud() {
        return 0;
    }

    @Override
    public double obtenerLongitud() {
        return 0;
    }

    @Override
    public void obtenerCoodenadas(double latitud, double longitud) {

    }

    @Override
    public String buscarRed(ArrayList<String> redes) {
        return null;
    }

    @Override
    public boolean habitarWifi(boolean habilitar) {
        return false;
    }





}
