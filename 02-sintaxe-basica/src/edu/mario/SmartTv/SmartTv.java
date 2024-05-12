package edu.mario.SmartTv;

public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 99;

    public void definirCanal(int valor)
    {
        canal = valor;
        System.err.println("O número do canal é : " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.err.println("O número do canal é : " + canal);
    }

    public void diminuirCanal()
    {
        if(canal > 1)
        {
            canal--;
            System.err.println("O número do canal é : " + canal);
        }
    }

    public void aumentarVolume()
    {
        if(volume < 100 )
        {
            volume++;
            System.err.println("Aumentando o volume para : " + volume);
        }
    }
    public void diminuirVolume()
    {
        if(volume > 0)
        {
            volume--;
            System.err.println("Diminuindo o volume para : " + volume);
        }
    }
    public void ligarTv()
    {
        if(!ligada)
        {
            ligada = true;
            System.err.println("Tv Ligada.");
        }
    }
    public void desligarTv()
    {
        if(ligada)
        {
            ligada = false;
            System.err.println("Tv desligada.");
        }
    }
}
