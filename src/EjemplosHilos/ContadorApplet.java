
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ContadorApplet extends Applet implements Runnable, ActionListener {
	private Thread h;
	long CONTADOR = 0;
	private boolean parar;
	private Font fuente;
	private Button b1, b2;

	public void start() {
	}

	public void init() {
		setBackground(Color.yellow);
		add(b1 = new Button("Iniciar contador"));
		b1.addActionListener(this);
		add(b2 = new Button("Parar contador"));
		b2.addActionListener(this);
		fuente = new Font("Verdana", Font.BOLD, 26);
	}

	public void run() {
		parar = false;
		Thread hiloActual = Thread.currentThread();
		while (h == hiloActual && !parar) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
			CONTADOR++;
		}
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente); // fuente
		g.drawString(Long.toString((long) CONTADOR), 80, 100);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) // Pulso Iniciar contador o Continuar
		{
			b1.setLabel("Continuar");
			if (h != null && h.isAlive()) {	}          // Si el hilo est� corriendo
 				                                        //  no hago nada.
			else {
				// creo hilo la primera vez y cuando finaliza el m�todo run
				h = new Thread(this);
				h.start();
			}
		} else if (e.getSource() == b2) // Pulso Parar contador
			parar = true; // para que finalice el while en el m�todo run
	}// actionPerformed

	public void stop() {
		h = null;
	}
}//