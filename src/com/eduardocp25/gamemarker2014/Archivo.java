package com.eduardocp25.gamemarker2014;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Archivo {
	
	private JFileChooser fileChooser;
	private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de texto","txt");
	private File file=null;
	private boolean isopen=false;//control to see if the file is opened
	private ArrayList contenido=new ArrayList();//Stores the read txt records
	private int index=0;//keeps track of the record currently visible
	
	//fields swing
	private JTextField id;
	private JTextField name;
	private JTextField cat;
	private JTextField year;
	private JTextField des;
	private JTextField point;
	private JTextField web;
	
	
	//***builders, class
	
	//we published our variables
	public Archivo(JTextField id,JTextField name,JTextField cat,JTextField year,JTextField des,JTextField point,JTextField web)
	{
		this.id=id;
		this.name=name;
		this.cat=cat;
		this.year=year;
		this.des=des;
		this.point=point;
		this.web=web;
		System.out.println("Power by Eduardo Raúl del Puerto Benítez.-");
		JOptionPane.showMessageDialog(null, "Power by Eduardo Raúl del Puerto Benítez.-! ");
	}
	
	//Returns the name of the open file or else calls him "Sin titulo-Power by Eduardo"
	
	public String getFileName()
	{
		if(file != null)
			return file.getName();
		else
			return "Sin Titulo - Power By Eduardo";
	}
	
	//opens the save as, stores the fields in the txt
	
	public void GuardarComo(String texto)
	{
		fileChooser = new JFileChooser();
		fileChooser.setFileFilter(filter);
		int result = fileChooser.showSaveDialog(null);
		
		if ( result == JFileChooser.APPROVE_OPTION )
		{
			this.isopen = false;
			this.contenido.clear();
			this.index=1;
			
			if ( escribir( fileChooser.getSelectedFile(), texto) )
			{
				JOptionPane.showMessageDialog(null, "Archivo '" + fileChooser.getSelectedFile().getName() + "' guardado correctamente! ");
				this.isopen=true;
			}
		}
	}
	
	//adds the new data to txt
	
	public void Actualizar(String texto)
	{
		//If you open this file, then update
		if( this.file != null)
		{
			if ( escribir( this.file , texto) )
			{
				JOptionPane.showMessageDialog(null, "Archivo '" + this.file.getName() + "' actualizado correctamente! ");
			}
		}
		else //but created a new
		{
			GuardarComo( texto );
		}
	}
	
	//Displays the Open File dialog
	 public void Abrir()
	 {
		 fileChooser = new JFileChooser();
		 fileChooser.setFileFilter(filter);
		 //fileChooser.setCurrentDirectory(new java.io.File("e:/")); //in case you want to predefine a specific place to start searching!
		 int result = fileChooser.showOpenDialog(null);
		 
		 if ( result == JFileChooser.APPROVE_OPTION )
		 {
			 this.file = fileChooser.getSelectedFile();
			 leer( this.file );
			 this.isopen=true;
		 }
	 }
	 

	 /* Function that writes a record into the text file
	  * If the file already had re-writes these records and end
	  * Write the new record
	  */
	 
	 @SuppressWarnings( "unchecked")
	private boolean escribir(File fichero, String texto)
	 {
		 boolean res=false;
		 PrintWriter writer = null;
		 
		 try {
			 String f = fichero.toString();
			 //verifies that the extension exists or it adds!
			 
			 if(!f.substring( f.length()-4, f.length()).equals(".txt") )//cambie el -4 por -7
			 {
				 f = f + ".txt";
				 fichero = new File(f);
			 }
			 
			 writer = new PrintWriter( fichero );
			 //if a file is open!
			 if( this.isopen )
			 { // added first previous conenido line by line!
				 Iterator It = contenido.iterator();
				 while (It.hasNext())
				 {
					 writer.println( It.next() );
				 }
			//row is added to the file
			writer.println( texto );
			this.contenido.add(texto);
			 }
			 
			 else //are saving for the first time
			 {
				 this.contenido.add(texto);
				 writer.println( texto );
			 }
			 
			 this.file = fichero;
			 writer.close();
			 res = true;
		 	}
		 
		 catch (FileNotFoundException ex) 
		 {
			 System.out.println("Error O_O :" + ex);
		 } 
		 
		 finally 
		 {
			 writer.close();
		 }
		 
		 return res;
	 }
	 
	 /* Read line by line from the text file and save the changes
	 * ArrayList according to a read command
	 * Get the file
	 */
	 @SuppressWarnings("unchecked")
	public boolean leer( File fichero )
	 {
		 BufferedReader reader = null;
		 try 
		 {
			 reader = new BufferedReader(new FileReader(fichero));
			 this.contenido.clear();
			 String linea;
			 
			 while ( (linea = reader.readLine() ) != null) 
			 {
				 this.contenido.add( linea );
			 }
			 //displays the first record in the interface
			 Siguiente();
			 return true;
		 } 
		 
		 catch (IOException ex) 
		 {
			 System.out.println("Error Error O_O : " + ex);
		 } 
		 finally 
		 {
			 try 
			 {
				 reader.close();
			 } 
			 catch (IOException ex) 
			 {
				 System.out.println("Error Error O_O : " + ex);
			 }
		 }
		 return false;
	 }

	 //Function that advances to the next record in the ArrayList and displays 
	 public void Siguiente()
	 {
		 if( this.file != null )
		 {
			 //increases by 1 the variable "index", if the size of lines is exceeded, again set to 1 to prevent my program explodes!
			 this.index = (index>=contenido.size())? 1 : index + 1;
			 int count =1;
			 Iterator It = contenido.iterator();
			 //search begins
			 while (It.hasNext())
			 {
				 String tmp = It.next().toString();
				 if( count == index)//if values ​​is assigned
				 { //separates the registration fields. Separator = "," (comma)
					 String[] datos = tmp.split(",");
					 this.id.setText(datos[0]);
					 this.name.setText(datos[1]);
					 this.cat.setText(datos[2]);
					 this.year.setText(datos[3]);
					 this.des.setText(datos[4]);
					 this.point.setText(datos[5]);
					 this.web.setText(datos[6]);
					 break;
				 }
			
				 count ++;
			}
		 }
	 }
	 
	 public void Anterior()
	 {
		 if( this.file != null )
		 {
			 //Decreases by 1 the variable "index", if the size of lines is exceeded, again set to 1 to prevent my program explodes!
			 this.index = (index>=contenido.size())? 1 : index - 1;
			 int count =1;
			 Iterator It = contenido.iterator();
			 //search begins
			 while (It.hasNext())
			 {
				 String tmp = It.next().toString();
				 if( count == index)//if values ​​is assigned
				 { //separates the registration fields. Separator = "," (comma)
					 String[] datos = tmp.split(",");
					 this.id.setText(datos[0]);
					 this.name.setText(datos[1]);
					 this.cat.setText(datos[2]);
					 this.year.setText(datos[3]);
					 this.des.setText(datos[4]);
					 this.point.setText(datos[5]);
					 this.web.setText(datos[6]);
					 break;
				 }
				 
				 count --;
			 }
		 }
	 }

}
