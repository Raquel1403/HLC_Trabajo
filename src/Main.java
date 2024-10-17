
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<>();
        Collection<Cliente> colleccionClien = listaClientes;

        Cliente cliente = new Cliente("111", "Sofia", "12/02/1996");
        colleccionClien.add(cliente);
        colleccionClien.add(new Cliente("112", "Sofia", "12/02/1996"));
        colleccionClien.remove(cliente);
        colleccionClien.clear();
        colleccionClien.add(new Cliente("113", "Sofia", "12/02/1996"));
        colleccionClien.add(new Cliente("114", "Sofia", "12/02/1996"));
        int tamano = colleccionClien.size();
        System.out.println(tamano);
        boolean vacio = colleccionClien.isEmpty();
        System.out.println(vacio);
        boolean esta = colleccionClien.contains(new Cliente("114", "Sofia", "12/02/1996"));
        System.out.println(esta);
    }

}