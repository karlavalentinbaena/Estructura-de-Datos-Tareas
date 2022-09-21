
/*Este código lo hice en el IDE Eclipse, en donde me apoye de algunos tutoriales 
para poder resolverlo de una mejor manera*/

package elJuegoDeLaVida;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InicioJuego extends JApplet {
	// Número de filas y columnas que tendrá el tablero
	private int filas = 10;
	private int columnas = 10;
	private boolean boton;
	private boolean gen = false;
	private boolean click = false;
	private ControlJuego ct = new ControlJuego(filas, columnas);
	private JLabel[][] area = new JLabel[filas][columnas];
	private JPanel ld1 = new JPanel();
	private JPanel ld2 = new JPanel();
	private JPanel bSiguienteG = new JPanel();
	private JPanel ld4 = new JPanel();
	private GridLayout contorno = new GridLayout();
	private JButton siguienteGen = new JButton();

	// Aparezca una ventana que contendrá el tablero de 10 x 10
	public static void main(String[] args) {
		InicioJuego st = new InicioJuego();
		// applet.isStandalone = true;
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(3);
		ventana.setTitle("El juego de la vida");
		ventana.getContentPane().add(st, BorderLayout.CENTER);
		st.init();
		// st.start();
		ventana.setSize(425, 350);
		Dimension t = Toolkit.getDefaultToolkit().getScreenSize();
		ventana.setLocation((t.width - ventana.getSize().width) / 2, (t.height - ventana.getSize().height) / 2);
		ventana.setVisible(true);
	}

	// Para que aparezca el tablero
	@Override
	public void init() {
		try {
			this.setSize(new Dimension(420, 320));
			ld1.setLayout(null);
			ld2.setBounds(new Rectangle(16, 11, 362, 227));
			ld2.setLayout(contorno);
			contorno.setColumns(columnas);
			contorno.setRows(filas);
			// aparezca el botón para pasar a la siguiente generación
			bSiguienteG.setBounds(new Rectangle(19, 268, 384, 70));
			siguienteGen.setText("Siguiente generación");
			siguienteGen.addKeyListener(new KeyListener() {

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == KeyEvent.VK_ENTER)
						Generaciones();
				}

				@Override
				public void keyReleased(KeyEvent e) {
				}

				@Override
				public void keyTyped(KeyEvent e) {
				}
			});
			siguienteGen.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Generaciones();
				}
			});

			ld4.setBounds(new Rectangle(14, 8, 392, 250));
			ld4.setLayout(null);
			this.getContentPane().add(ld1, BorderLayout.CENTER);
			bSiguienteG.add(siguienteGen, null);
			ld1.add(ld4, null);
			ld4.add(ld2, null);
			ld1.add(bSiguienteG, null);

			// recorrer area
			for (int i = 0; i < area.length; i++) {
				for (int j = 0; j < area[0].length; j++) {
					area[i][j] = new JLabel();
					area[i][j].setBackground(Color.white);
					area[i][j].setOpaque(true);
					area[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
					area[i][j].addMouseListener(new MouseListener() {
						@Override
						public void mouseClicked(MouseEvent e) {
						}

						@Override
						public void mouseEntered(MouseEvent e) {
							if (click) {
								Object cel = e.getSource();
								if (boton)
									((JLabel) cel).setBackground(Color.pink);
								else
									((JLabel) cel).setBackground(Color.red);
							}
							// Cuando cambie de generación
							boolean[][] areaD = new boolean[filas][columnas];
							for (int i = 0; i < areaD.length; i++) {
								for (int j = 0; j < areaD[0].length; j++) {
									if (area[i][j].getBackground().equals(Color.pink))
										areaD[i][j] = true;
									else
										areaD[i][j] = false;
								}
							}

							ct.setArea(areaD);
						}

						// para cuando se hace click con el mouse
						@Override
						public void mouseExited(MouseEvent e) {
						}

						@Override
						public void mousePressed(MouseEvent e) {
							gen = true;
							click = true;
							Object cel = e.getSource();
							if (e.getButton() == MouseEvent.BUTTON1) {
								boton = true;
								((JLabel) cel).setBackground(Color.pink);
							}
						}

						@Override
						public void mouseReleased(MouseEvent e) {
							click = false;
						}
					});
					ld2.add(area[i][j]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void Generaciones() {
		// pase a la siguiente generacón y marque las celulas que sobreviven
		ct.sigGen();
		boolean[][] area2 = ct.getArea();
		for (int i = 0; i < area2.length; i++) {
			for (int j = 0; j < area2[0].length; j++) {
				if (area2[i][j] == true)
					area[i][j].setBackground(Color.pink);
				else
					area[i][j].setBackground(Color.white);
			}
		}
	}
}
