package damtema1;

import java.util.ArrayList;
import java.util.Scanner;

public class BandaMusical {
	private ArrayList<String> bandas;
	private Scanner scanner;

	public BandaMusical() {
		bandas = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void mostrarMenu() {
		int opcion;
		do {
			System.out.println("--- Gestión de Bandas Musicales ---");
			System.out.println("1. Añadir una nueva banda");
			System.out.println("2. Eliminar una banda");
			System.out.println("3. Mostrar todas las bandas");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				anadirBanda();
				break;
			case 2:
				eliminarBanda();
				break;
			case 3:
				mostrarBandas();
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		} while (opcion != 4);
	}

	public void anadirBanda() {
		System.out.print("Ingrese el nombre de la banda: ");
		String nombreBanda = scanner.nextLine();
		bandas.add(nombreBanda);
		System.out.println("Banda añadida exitosamente.");
	}

	public void eliminarBanda() {
		System.out.print("Ingrese el nombre de la banda a eliminar: ");
		String nombreBanda = scanner.nextLine();
		if (bandas.remove(nombreBanda)) {
			System.out.println("Banda eliminada exitosamente.");
		} else {
			System.out.println("La banda no se encontró en la lista.");
		}
	}

	public void mostrarBandas() {
		if (bandas.isEmpty()) {
			System.out.println("No hay bandas en la lista.");
		} else {
			System.out.println("Lista de Bandas:");
			for (String banda : bandas) {
				System.out.println("- " + banda);
			}
		}
	}

	public static void main(String[] args) {
		BandaMusical app = new BandaMusical();
		app.mostrarMenu();
	}
}
