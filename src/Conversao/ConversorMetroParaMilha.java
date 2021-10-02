package Conversao;

public class ConversorMetroParaMilha implements Command {

    @Override
    public double converte(double valor) { 
        return valor*0.000621371;
    }
    
}
