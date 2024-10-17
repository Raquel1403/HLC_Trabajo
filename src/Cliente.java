import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cliente implements Comparable<Cliente> {

	String dni;
	String nombre;
	LocalDate fechaNacimiento;

	Cliente(String dni, String nombre, String fecha) {
		this.dni = dni;
		this.nombre = nombre;
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fecha, formatoFecha);
	}

	int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public boolean equals(Object ob) {
		Cliente cliente = (Cliente) ob;
		return dni.equals(cliente.dni);
	}

	@Override
	public String toString() {
		return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad();
	}

	@Override
	public int compareTo(Cliente o) {

		return dni.compareTo(o.dni);
	}



	public String getDni() {
		System.out.println(this.dni);
		return dni;
	}

	public void conflicto(){
		System.out.println("Creo conflicto");
	}
}
