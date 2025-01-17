import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el usuario y contraseña predeterminados
        String usuarioPredeterminado = "diego";
        String contraseñaPredeterminada = "123";

        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Bienvenido a La Merced");
            System.out.print("Nombre de usuario: ");
            String nombreUsuario = scanner.next();
            System.out.print("Contraseña: ");
            String contraseña = scanner.next();

            if (nombreUsuario.equals(usuarioPredeterminado) && contraseña.equals(contraseñaPredeterminada)) {

                Usuario usuario = new Usuario(1, nombreUsuario, contraseña);
                Receta receta = new Receta();
                LaMerced merced = new LaMerced(usuario, receta);

                boolean continuar = true;

                while (continuar) {
                    System.out.println("\nMenú de opciones:");
                    System.out.println("1. Agregar ingrediente");
                    System.out.println("2. Eliminar ingrediente");
                    System.out.println("3. Mostrar ingredientes");
                    System.out.println("4. Crear receta con ingredientes disponibles");
                    System.out.println("5. Mostrar recetas");
                    System.out.println("6. Salir");
                    System.out.print("Seleccione una opción: ");

                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Nombre del ingrediente: ");
                            String nombreIngrediente = scanner.next();
                            System.out.print("Unidad en valor(sin especificar Kg, lb): ");							
                            Unidad unidad = Unidad.valueOf(scanner.next());
                            System.out.print("Valor de unidad: ");
                            int valorUnidad = scanner.nextInt();
                            System.out.print("Sitio de compra: ");
                            String sitioCompra = scanner.next();
                            System.out.print("Calorías: ");
                            int calorias = scanner.nextInt();

                            Ingrediente nuevoIngrediente = new Ingrediente(nombreIngrediente, unidad, valorUnidad, sitioCompra, calorias);
                            merced.agregarIngrediente(nuevoIngrediente);
                            System.out.println("Ingrediente agregado con éxito.");
                            break;
                        case 2:
                            if (merced.getIngredientes().isEmpty()) {
                                System.out.println("No hay ingredientes para eliminar.");
                            } else {
                                System.out.println("Lista de ingredientes:");
                                for (int i = 0; i < merced.getIngredientes().size(); i++) {
                                    System.out.println((i + 1) + ". " + merced.getIngredientes().get(i));
                                }
                                System.out.print("Seleccione el número del ingrediente a eliminar: ");
                                int indice = scanner.nextInt();
                                if (indice >= 1 && indice <= merced.getIngredientes().size()) {
                                    merced.eliminarIngrediente(merced.getIngredientes().get(indice - 1));
                                    System.out.println("Ingrediente eliminado con éxito.");
                                } else {
                                    System.out.println("Número de ingrediente no válido.");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Ingredientes en La Merced:");
                            for (int i = 0; i < merced.getIngredientes().size(); i++) {
                                System.out.println((i + 1) + ". " + merced.getIngredientes().get(i));
                            }
                            break;
                        case 4:
                            if (merced.getIngredientes().isEmpty()) {
                                System.out.println("No hay ingredientes para crear una receta.");
                            } else {
                                System.out.print("Ingrese la cantidad de comensales: ");
                                int cantidadComensales = scanner.nextInt();
                                System.out.print("Describa la preparación: ");
                                scanner.nextLine(); // Captura el salto de línea pendiente
                                String descripcionPreparacion = scanner.nextLine();

                                Receta nuevaReceta = merced.crearReceta(cantidadComensales, descripcionPreparacion);
                                System.out.println("Receta creada con éxito:");
                                System.out.println(nuevaReceta);
                            }
                            break;
                        case 5:
                            List<Receta> recetas = merced.getRecetas();
                            if (recetas.isEmpty()) {
                                System.out.println("No hay recetas creadas.");
                            } else {
                                System.out.println("Lista de recetas creadas:");
                                for (int i = 0; i < recetas.size(); i++) {
                                    System.out.println((i + 1) + ". " + recetas.get(i));
                                }
                            }
                            break;
                        case 6:
                            continuar = false;
                            break;

                    }
                }

                System.out.println("Gracias por usar La Merced.");
                break; // Sale del bucle de inicio de sesión exitoso
            } else {
                // Las credenciales son incorrectas, disminuye el número de intentos
                intentos--;

                if (intentos > 0) {
                    System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + intentos);
                } else {
                    System.out.println("Alejate o llamo a la policía.");
                }
            }
        }

        scanner.close();
    }
}
