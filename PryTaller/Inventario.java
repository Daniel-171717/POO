package PryTaller;
import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private List<Productos> producto = new ArrayList<>();

    //Metodo para Agrear Productos y Guardar el Producto en el Inventario.
    public void agregarProducto(Productos productos)
    {
        producto.add(productos);
    }

    public List<Productos> productos()
    {
        return producto;
    }

    //Metodos para Mostrar Prouctos.
    public void mostrarProductos ()
    {
        System.out.println("\t\tPRODUCTOS ALMACENADOS EN EL INVENTARIO");
        //Usamos la funcion (isEmpty) para verificar si la lista se encuentra vacio o no.
        if (producto.isEmpty())
            System.out.println("EL INVENTARIO ESTA VACIO");
        else
        {
            for (int i=0;i<producto.size();i++)
            {
                Productos productosT = producto.get(i);
                System.out.println(productosT.ImprimirProducto());
            }
        }
    }

    //Metodo para Buscar Productos.
    public void buscarProducto (String nombreProducto)
    {
        for (Productos nombreBuscar : producto)
            {
                /*Usamos la funcion (equalsIgnoreCase) para verificar el nombre del producto a buscar
                sin importar si esta escrita con minuscula o mayuscula.*/
                if(nombreBuscar.GetProducto().equalsIgnoreCase(nombreProducto))
                {
                    System.out.println("EL PRODUCTO ENCONTRADO ES: "+nombreProducto);
                }
                else
                {
                    System.out.println("EL PRODUCTO NO SE HA ENCONTRADO: "+nombreProducto);
                }
            }
    }

    //Metodo para Calcular el Valor Total del Inventario.
    public double valorTotal ()
    {
        double cobroTotal=0;
        for (Productos nombreBuscar : producto)
            {
                cobroTotal += nombreBuscar.GetCantidad()*nombreBuscar.GetPrecio();
            }
        return cobroTotal;
    }

    /*Metodo para elimiar un producto del inventario*/
    public void EliminarProducto(String eliminarProductos)
    {
        for (int i=0;i<producto.size();i++)
        {
            boolean verdad = false;
            if(producto.get(i).GetProducto().equalsIgnoreCase(eliminarProductos))
            {
                producto.remove(i);
                System.out.println("EL PRODUCTO SE HA ELIMINADO CORRECTAMENTE");
                verdad = true;
                break;
            }
            if(!verdad)
            {
                System.out.println("EL PRODUCTO NO SE HA ENCONTRADO");
            }
        }
    }
}
