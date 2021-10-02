package Conversao;

public class ConversorMetroParaQuilometro implements Command {

    @Override
    public double converte(double valor) { 
        return valor/1000;
    }
    
}
