package Conversao;

public class ConversorMetroParaCentimetro implements Command {

    @Override
    public double converte(double valor) { 
        return valor*100;
    }
    
}
