package com.eduardocp25.gamemarker2014;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JTextField;
import javax.swing.GroupLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Ventana extends javax.swing.JFrame {
	
		
	private static final long serialVersionUID = 1L;//Nose que es pero el ide rompia por este serial XD
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	
	private JMenu jMenu1;
	private JMenu jMenu2;
	
	private JMenuBar jMenuBar1;
	
	private JMenuItem jMenuItem3;
	
	private JPanel jPanel1;
		
	private Separator jSeparator1;
	
	private JMenuItem mAbrir;
	private JMenuItem mGuardar;
	private JMenuItem mGuardarComo;
	private JMenuItem mSgte;
	private JMenuItem mAntr;
	
	private JTextField txtCategoria;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtAño;
	private JTextField txtDescripcion;
	private JTextField txtPuntuacion;
	private JTextField txtWebsite;
	
	//instancia de clase
	private Archivo file;
	/** Creamos el nuevo formulario para la interfaz */
	public Ventana()
	{
		initComponents();
		this.setLocationRelativeTo(null);
		//crea la instancia pasando como parametros los controles JTextField
		file = new Archivo( this.txtID, this.txtNombre, this.txtCategoria , this.txtAño , this.txtDescripcion , this.txtPuntuacion , this.txtWebsite );
		this.setTitle("" + file.getFileName() + " - Game_Ranking 2014 -");
	}
	/*Este método se llama desde dentro del constructor para
	* Inicializa el formulario.
	* Observacion: NO modifiques este código. El contenido de este método es
	* Siempre regenerado por el editor de formulario.
	* o te va tocar configurar todo de vuelta!!!...
	*/
	private void initComponents()
	{
		java.awt.GridBagConstraints gridBagConstraints;
		jPanel1 = new javax.swing.JPanel();
				
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		
		txtID = new JTextField();
		txtNombre = new JTextField();
		txtCategoria = new JTextField();
		txtAño = new JTextField();
		txtDescripcion = new JTextField();
		txtPuntuacion = new JTextField();
		txtWebsite = new JTextField();
		
		jMenuBar1 = new JMenuBar();
		
		jMenu1 = new JMenu();
		
		mAbrir = new JMenuItem();
		mGuardar = new JMenuItem();
		mGuardarComo = new JMenuItem();
		
		jSeparator1 = new Separator();
		
		jMenuItem3 = new JMenuItem();
		jMenu2 = new JMenu();
		
		mAntr = new JMenuItem();
		mSgte = new JMenuItem();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel1.setLayout(new GridBagLayout());
		
			
		jLabel1.setText("ID :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel1, gridBagConstraints);
		
		jLabel2.setText("Nombre :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel2, gridBagConstraints);
		
		jLabel3.setText("Categoria :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel3, gridBagConstraints);
		
		jLabel4.setText("Año :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel4, gridBagConstraints);
		
		jLabel5.setText("Descripción :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel5, gridBagConstraints);
		
		jLabel6.setText("Puntuación :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel6, gridBagConstraints);
		
		jLabel7.setText("WebSite :");
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 10, 5, 0);
		jPanel1.add(jLabel7, gridBagConstraints);
		
		txtID.setPreferredSize(new Dimension(120, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtID, gridBagConstraints);
		
		txtNombre.setPreferredSize(new Dimension(260, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtNombre, gridBagConstraints);
		
		txtCategoria.setPreferredSize(new Dimension(260, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtCategoria, gridBagConstraints);
		
		txtAño.setPreferredSize(new Dimension(260, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtAño, gridBagConstraints);
		
		txtDescripcion.setPreferredSize(new Dimension(260, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtDescripcion, gridBagConstraints);
		
		txtPuntuacion.setPreferredSize(new Dimension(260, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtPuntuacion, gridBagConstraints);
		
		txtWebsite.setPreferredSize(new Dimension(260, 20));
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new Insets(5, 0, 5, 10);
		jPanel1.add(txtWebsite, gridBagConstraints);
	
		/*Empieza la construccion de mi menu archivo!*/
		jMenu1.setText("Archivo");
		mAbrir.setText("Abrir archivo *.TXT");
		mAbrir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				mAbrirActionPerformed(evt);
			}
		});
	
		jMenu1.add(mAbrir);
		mGuardar.setText("Guardar");
		mGuardar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				mGuardarActionPerformed(evt);
			}
		});
	
		/*_________________________________________________________________*/
		jMenu1.add(mGuardar);
		mGuardarComo.setText("Guardar como...");
		mGuardarComo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				mGuardarComoActionPerformed(evt);
			}
		});
	
		jMenu1.add(mGuardarComo);
		jMenu1.add(jSeparator1);
		
	/*__________________________________________________________________*/
		jMenu1.add(jMenuItem3);
		jMenuItem3.setText("Salir");
		jMenuItem3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt) 
			{
				System.exit(0);
			}
		});
		
	jMenuBar1.add(jMenu1);
	
	/*Empieza la construccion de mi menu Herramientas!*/
	
	jMenu2.setText("Herramientas");
	mAntr.setText("Anterior");
	mAntr.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent evt) 
		{
			mAntrActionPerformed(evt);
		}
	});
	
	mSgte.setText("Siguiente");
	mSgte.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent evt) 
		{
			mSgteActionPerformed(evt);
		}
	});
	
	jMenu2.add(mAntr);
	jMenu2.add(mSgte);
	jMenuBar1.add(jMenu2);
	setJMenuBar(jMenuBar1);
	GroupLayout layout = new GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
		
	layout.setVerticalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
	pack();
	}
	
	private void mGuardarComoActionPerformed(ActionEvent evt) 
	{//GENERA-PRIMERO:event_mGuardarComoActionPerformed
		String datos = this.txtID.getText() + "," + this.txtNombre.getText() + "," + this.txtCategoria.getText() + "," + this.txtAño.getText() + "," + this.txtDescripcion.getText() + "," + this.txtPuntuacion.getText() + "," + this.txtWebsite.getText();
		file.GuardarComo(datos);
		this.setTitle("" + file.getFileName() + " - Game_Ranking 2014 -");
	}//GENERA-DESPUES:event_mGuardarComoActionPerformed
	
	private void mAbrirActionPerformed(ActionEvent evt) 
	{//GENERA-PRIMERO:event_mAbrirActionPerformed
		file.Abrir();
		this.setTitle("" + file.getFileName() + " - - Game_Ranking 2014 -");
	}//GENERA-DESPUES:event_mAbrirActionPerformed
	
	private void mSgteActionPerformed(ActionEvent evt) 
	{//GENERA-PRIMERO:event_mSgteActionPerformed
		file.Siguiente();
	}//GENERA-DESPUES:event_mSgteActionPerformed
	
	private void mAntrActionPerformed (ActionEvent evt) 
	{//GENERA-PRIMERO:event_mSgteActionPerformed
		file.Anterior();
	}//GENERA-DESPUES:event_mAntrActionPerformed
	
	private void mGuardarActionPerformed(ActionEvent evt) 
	{//GENERA-PRIMERO:event_mGuardarActionPerformed
		String datos = this.txtID.getText() + "," + this.txtNombre.getText() + "," + this.txtCategoria.getText() + "," + this.txtAño.getText() + "," + this.txtDescripcion.getText() + "," + this.txtPuntuacion.getText() + "," + this.txtWebsite.getText();
		file.Actualizar(datos);
		this.setTitle("" + file.getFileName() + "- Game_Ranking 2014 -");
	}//GENERA-DESPUES:event_mGuardarActionPerformed
	
}
