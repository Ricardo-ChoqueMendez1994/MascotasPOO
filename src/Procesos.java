
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	int salir=0, opcion=0,buscarCodigo=0,id=0,age=0;
	String usuario="", type="", nameM="",buscarnombre="";
	HashMap<Integer, Mascota> mapMascotas = new HashMap<Integer, Mascota>();
	
	public void iniciar() {
		do {
			salir=0;
			String menu = "Software de ingreso y busqueda de mascotas\n";
			menu += "1: Ingresar Mascotas \n";
			menu += "2: Buscar Mascotas Por Codigo \n";
			menu += "3: Buscar Mascota Por nombre\n";
			menu += "4: Mostar La lista De Mascotas Ingresadas";
			
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				Mascota animal = new Mascota ();
				animal.GuardarMascota();
				animal.GuardarDatos(animal.codigo, animal.nombreM,animal.especie, animal.edad);
				mapMascotas.put((animal.codigo), animal);
				break;
			case 2:
				buscarMascota();
				
			case 3:
				buscarPorNombre();

			case 4:
				imprimirMascotas();
				break;
			}
			salir = Integer.parseInt(JOptionPane.showInputDialog(usuario + "si desea salir ingrese 0 si desea continuar ingrese cualquier letra"));
		} while (salir != 0 );
	}

	public void buscarMascota () {
		
		buscarCodigo= Integer.parseInt(JOptionPane.showInputDialog(usuario + "ingrese el codigo de su mascota"));
		Mascota mascota = mapMascotas.get(buscarCodigo);
		id = mascota.codigo;
		age = mascota.edad;
		nameM = mascota.nombreM;
		type= mascota.especie;
		System.out.println(usuario + "el codigo de su mascota es: "+id+" la edad de tu perro es "+age+" el nombre de tu mascota es "+nameM+" y por ultimo el tipo de mascota es "+type);
		
	}
	
	public void buscarPorNombre() {
		buscarnombre =JOptionPane.showInputDialog(usuario + " Ingrese el nombre de su mascota");
		for (Mascota mascota : mapMascotas.values()) {
			
			if (buscarnombre == mascota.nombreM) {
				id = mascota.codigo;
			}
		}
		
	}
	
	public void imprimirMascotas() {
		
		for (Mascota mascota : mapMascotas.values()) {
		System.out.println("codigo: " + mascota.codigo);
		System.out.println("Nombre: " + mascota.nombreM);
		System.out.println("Especie: " + mascota.especie);
		System.out.println("Edad: " + mascota.edad);
		System.out.println("---------------------------INFORMACION DE LA MASCOTA TERMINADA---------------------------------");
		}

	}
	
}