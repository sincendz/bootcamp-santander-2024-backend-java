package edu.mario.SmartTv;

public class Usuario {
    

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.ligarTv();
        for(int i = 0; i < 100000; i++)
        {
            smartTv.diminuirVolume();
        }

        for(int i = 0; i < 50; i++)
        {
            smartTv.aumentarVolume();
        }

        smartTv.definirCanal(49);

        smartTv.desligarTv();
    }
}
