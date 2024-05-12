package edu.mario.SmartTv;

public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 99;

    public void definirCanal(int valor)
    {
        canal = valor;
        System.out.println("O número do canal é : " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O número do canal é : " + canal);
    }

    public void diminuirCanal()
    {
        if(canal > 1)
        {
            canal--;
            System.out.println("O número do canal é : " + canal);
        }
    }

    public void aumentarVolume()
    {
        if(volume < 100 )
        {
            volume++;
            System.out.println("Aumentando o volume para : " + volume);
        }
    }
    public void diminuirVolume()
    {
        if(volume > 0)
        {
            volume--;
            System.out.println("Diminuindo o volume para : " + volume);
        }
    }
    public void ligarTv()
    {
        if(!ligada)
        {
            ligada = true;
            System.out.println("Tv Ligada.");
        }
    }
    public void desligarTv()
    {
        if(ligada)
        {
            ligada = false;
            System.out.println("Tv desligada.");
        }
    }
}
