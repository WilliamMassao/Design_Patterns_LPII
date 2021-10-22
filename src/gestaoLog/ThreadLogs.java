package gestaoLog;

import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadLogs extends Thread {

    private boolean status;

    public void statusTrueFalse(boolean value) {
        status = value;
    }

    @Override
    public void run() {
        statusTrueFalse(true);
        while (status) {
            try {
                String msg = GerenciadorLog.getInstancia().retirarMensagemLog();
                if (msg != null) {
                    gerarMensagemLog(msg);
                }
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadLogs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void gerarMensagemLog(String msg) throws InterruptedException {
        System.out.printf("%s - Valor do Log %s\n", Instant.now().toString(), msg);
        Thread.sleep(500);
    }
    
}
