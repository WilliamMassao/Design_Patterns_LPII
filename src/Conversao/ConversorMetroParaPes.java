package Conversao;

public class ConversorMetroParaPes implements Command {

    @Override
    public double converte(double valor) { 
        return valor*3.28084;
    }
    
}
