
import javax.swing.JOptionPane;

public class Mascota {
	int edad=0, codigo=0;
	String nombreM="", especie="", usuario="";
	
	public void GuardarMascota() {
		usuario=JOptionPane.showInputDialog("Señor@ usuario ingrese su nombre");
		nombreM=JOptionPane.showInputDialog(usuario + " Ingresa el nombre de tu mascota");
		codigo=Integer.parseInt(JOptionPane.showInputDialog(usuario + " Ingresa el codigo de tu mascota"));
		edad=Integer.parseInt(JOptionPane.showInputDialog(usuario + " Ingresa la edad de tu mascota"));
		especie=JOptionPane.showInputDialog(usuario + " Ingresa la especie de tu mascota");
	
	}
	
	public void GuardarDatos(int codigo, String nombreM, String especie, int edad) {
		this.nombreM= nombreM;
		this.especie= especie;
		this.codigo= codigo;
		this.edad= edad;
	}
}