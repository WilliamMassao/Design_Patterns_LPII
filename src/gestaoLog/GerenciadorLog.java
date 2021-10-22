package gestaoLog;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciadorLog {
    

    ConcurrentLinkedQueue<String> filaMensagens;
    
    /* Implementação do Singleton */
    private static GerenciadorLog instancia;

    private GerenciadorLog() {
        filaMensagens = new ConcurrentLinkedQueue<>();
        //filaMensagens = new LinkedList<>();
    }

    public static GerenciadorLog getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorLog();
        }
        return instancia;
    }

    /* Fim da implementação do Singleton */
    ThreadLogs thread;

    public void adicionarMensagemLog(String msgLog) {
        filaMensagens.add(msgLog);
    }

    String retirarMensagemLog() {
        String msg = filaMensagens.poll();
        return msg;
    }
    
    public void ativar(){
        if (thread == null){
            thread = new ThreadLogs();
            thread.start();
        }
    }
    
    void desativar(){
        if (thread != null) {
            thread.statusTrueFalse(false);
            try {
                thread.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(GerenciadorLog.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (thread.isAlive())
                thread.interrupt();
        }
    }
}
