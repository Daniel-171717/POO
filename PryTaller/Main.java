package PryTaller;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean entrada=false;

        //Creamos el menu de Opciones.
        /*Utilizamos en tipo de dato boolean para realizar el ingreso de muchos productos,
        hasta que ya no lo utilicemos.
        */
        while (!entrada) {

            System.out.println("\t\tBIENVENIDO AL GESTIONADOR DEL INVENTARIO DE PRODUCTOS");
            System.out.println("1. AGREGAR PRODUCTOS AL INVENTARIO");
            System.out.println("2. MOSTRAR LISTADO DE PRODUCTOS");
            System.out.println("3. BUSCAR UN PRODUCTO POR SU NOMBRE");
            System.out.println("4. CALCULAR EL VALOR TOTAL DEL INVENTARIO");
            System.out.println("5. ELIMINAR UN PRODUCTO POR SU NOMBRE");
            System.out.println("6. SALIR");
            System.out.print("INGRESE UNA DE LA OPCIONES MOSTRADAS: ");
            int opcion=scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 1:
                        String producto;
                        int cantidad;
                        double precio;
                        System.out.println("\t\tBIENVENIDO");
                        System.out.print("INGRESA EL PRODUCTO QUE DESEAS GUARDAN EN EL INVENTARIO: ");
                        producto=scanner.nextLine();
                        System.out.print("INGRESA LA CANTIDAD DE PRODUCTOS QUE DESEAS GUARDAR: ");
                        cantidad=scanner.nextInt();
                        /*Validamos la cantidad de productos que ingresan al inventario.*/
                        while (cantidad<0) {
                            System.out.println("ERROR. ERROR. ERROR\nLA CANTIDAD NO PUEDE SER NEGATIVO");
                            System.out.print("INGRESA LA CANTIDAD DE PRODUCTOS QUE DESEAS GUARDAR: ");
                            cantidad=scanner.nextInt();
                        }
                        System.out.print("INGRESA EL PRECIO DEL PRODUCTO A GUARDAR: ");
                        precio=scanner.nextDouble();
                        /*Validamos el precio de los productos.*/
                        while (cantidad<0) {
                            System.out.println("ERROR. ERROR. ERROR\nEL PRECIO NO PUEDE SER NEGATIVO");
                            System.out.print("INGRESA EL PRECIO DEL PRODUCTO A GUARDAR: ");
                            precio=scanner.nextDouble();
                        }
                        /*Creamos un objeto de tipo Producto para guardar los productos ingresados.*/
                        Productos nuevoProducto = new Productos(producto, cantidad, precio);
                        /*Utilizamos el objeto de tipo Invenatario creado al inicio,
                        para agregar el producto a nuestra lista.*/
                        inventario.agregarProducto(nuevoProducto);
                    break;

                case 2:
                        inventario.mostrarProductos();
                    break;

                case 3:
                        System.out.print("INGRESA EL NOMBRE DEL PRODUCTO QUE DESEAS BUSCAR: ");
                        String buscarProductos = scanner.nextLine();
                        inventario.buscarProducto(buscarProductos);
                        
                    break;

                case 4:
                        double valortotal = inventario.valorTotal();
                        System.out.println("EL VALOR TOTAL DEL INVENTARIO ES: "+valortotal+"$");
                    break;

                case 5:
                        System.out.print("INGRESA EL NOMBRE DEL PRODUCTO QUE DESEAS : ");
                        String eliminarProductos = scanner.nextLine();
                        inventario.EliminarProducto(eliminarProductos);
                    break;

                case 6:
                        entrada=true;
                    break;

                default:
                        System.out.println("LA OPCION QUE HA INGRESADO NO HA SIDO ENCONTRADA.\nELIGE NUEVAMENTE UNA DE LAS OPCIONES");
                    break;
            }
        }
    }
}
