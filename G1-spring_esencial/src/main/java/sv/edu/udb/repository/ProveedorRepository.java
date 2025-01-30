package sv.edu.udb.repository;
import sv.edu.udb.repository.domain.Proveedor;
import sv.edu.udb.repository.domain.Producto;

import java.util.List;

public interface ProveedorRepository {
    Proveedor guardarProveedor(final String nombre, final List<Producto> productos);
}
