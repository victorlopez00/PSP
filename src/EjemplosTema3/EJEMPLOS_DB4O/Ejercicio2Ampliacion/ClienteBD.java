package EjemplosTema3.EJEMPLOS_DB4O.Ejercicio2Ampliacion;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.awt.*;

public class ClienteBD extends JFrame implements ActionListener, Runnable {
	private static final long serialVersionUID = 1L;
	static JTextField depconsultar = new JTextField(2);
	static JLabel etiqueta = new JLabel("Empleado a consultar:");
	private JScrollPane scrollpane1;
	static JTextArea textarea1;
	JButton boton = new JButton("Enviar");
	JButton desconectar = new JButton("Salir");
	boolean repetir = true;
	static Socket socket;

	ObjectInputStream inObjeto;
	DataOutputStream salida;

	// constructor
	public ClienteBD(Socket s) {
		super("OPERACIONES CON BD - Ejercicio 2 Ampliaci�n");
		socket = s;
		try {
			// flujo de salida -envio cadena
			salida = new DataOutputStream(socket.getOutputStream());
			// flujo de entrada -recibo objeto
			inObjeto = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		setLayout(null);
		etiqueta.setBounds(10, 10, 200, 30);
		add(etiqueta);
		// llenarLista();
		depconsultar.setBounds(210, 10, 50, 30);
		add(depconsultar);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 50, 400, 300);
		add(scrollpane1);
		boton.setBounds(420, 10, 100, 30);
		add(boton);
		desconectar.setBounds(420, 50, 100, 30);
		add(desconectar);

		textarea1.setEditable(false);
		boton.addActionListener(this);
		desconectar.addActionListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// NADA
	}// constructor

	// acci�n cuando pulsamos botones
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) { // ENVIAR DEP
			try {
				salida.writeUTF(depconsultar.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == desconectar) { // SALIR
			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.exit(0);

		}
	}

	// PROCESO
	// REPETITIVO-------------------------------------------------------------
	public void run() {
		String texto = "";
		textarea1.setFont(new java.awt.Font("Courier", Font.PLAIN, 12));
		while (repetir) {
			try {
				Empleados d = null;
				d = (Empleados) inObjeto.readObject();// recibo un objeto
				textarea1.setText("");
				textarea1.setForeground(Color.blue);
				if (d == null) {
					textarea1.setForeground(Color.red);
					PintaMensaje("    <<EL EMPLEADO NO EXISTE>>");
				} else {
					Departamentos de = d.getDepartamentos();

					String patron = "dd/MM/yyyy";
					SimpleDateFormat formato = new SimpleDateFormat(patron);
					String fecha = formato.format(d.getFechaAlt());
					//7369, 7566,7388, 7389
					textarea1.append("\n     ===============================");
					texto = "\n        N�mero Emp: " + d.getEmpNo()
							+ "\n        Apellido  : " + d.getApellido()
							+ "\n        Oficio    : " + d.getOficio()
							+ "\n        Salario   : " + d.getSalario()
							+ "\n        FechaAlta : " + fecha
							+ "\n        N� Dept   : " + de.getDeptNo()
							+ "\n        Nombre    : " + de.getDnombre()
							+ "\n        Localidad : " + de.getLoc();

					textarea1.append(texto);

					textarea1.append("\n     ===============================");
					// PintarEmpleados(d);// VISUALIZAR EMPLEADOS
				}
			} catch (SocketException s) {
				repetir = false;// se produce al cerrar socket en bot�n salir
			} catch (IOException e) {
				e.printStackTrace();
				repetir = false;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				repetir = false;
			}
		}
		try {
			socket.close(); // CERRAR SOCKET
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// fin run
		// -----------------------------------------------------------------
		// PINTA LOS EMPLEADOS EN EL AREA

	private void PintarEmpleados(Departamentos d) {
		Set<Empleados> listaemple = d.getEmpleadoses();// obtenemos
		// empleados
		textarea1.setForeground(Color.blue);
		if (listaemple == null) {
			PintaMensaje("EL DEPARTAMENTO NO TIENE EMPLEADOS");
		} else {
			PintaMensaje("EMPLEADOS DEL DEPARTAMENTO: " + listaemple.size());
			Iterator<Empleados> it = listaemple.iterator();
			while (it.hasNext()) {
				Empleados emple = new Empleados();
				emple = it.next();
				textarea1.append("\n" + emple.getEmpNo() + " * "
						+ emple.getApellido() + " * " + emple.getOficio()
						+ " * " + emple.getSalario());
			}
			textarea1
					.append("\n=========================================================");
		}
	}// ..
		// PINTA CABECERAS

	void PintaMensaje(String mensaje) {
		textarea1
				.append("\n=========================================================");
		textarea1.append("\n" + mensaje);
		textarea1
				.append("\n=========================================================");

	}// ..
		// MAIN----------------------------------------------------------

	public static void main(String args[]) throws UnknownHostException,
			IOException {
		int puerto = 44441;
		//
		Socket s = new Socket("localhost", puerto);
		ClienteBD hiloC = new ClienteBD(s);
		hiloC.setBounds(0, 0, 540, 400);
		hiloC.setVisible(true);
		new Thread(hiloC).start();
	}// fin main -----------------------------------------------------
}// Fin del CLIENTE