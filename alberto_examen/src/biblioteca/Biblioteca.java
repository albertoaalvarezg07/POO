package biblioteca;

public class Biblioteca {
	int numero_prestamos = 0;
	private String nombre;
	private String horario;
	private Material[] material = new Material[10];
	private Persona[] persona = new Persona[10];
	private Prestamo[] prestamo = new Prestamo[10];
	
	public Biblioteca() {
		nombre = "SuperBiblio";
		horario = "LUNES A VIERNES DE 8 A 15";
		material[0]= new Libro(123,"Julio Verne","Viaje al Centro de la Tierra", 1970,"disponible","96325");
		persona[0]= new Alumno(462,"Alberto Alvarez","albert@snpp.edu.py","0961",1000);
		prestarMaterial(material[0], persona[0]);
		verMaterialesPrestados();
	}

	private void verMaterialesPrestados() {
		System.out.println(prestamo[0].toString());
	}
	
	private void prestarMaterial(Material m, Persona p) {
		
		prestamo[numero_prestamos] = new Prestamo(m,p,"24/05/25","");
		numero_prestamos++;
	}
	
	public static void main(String[]args) {
		new Biblioteca();
	}
}
