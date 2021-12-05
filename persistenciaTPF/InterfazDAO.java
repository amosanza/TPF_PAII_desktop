package persistenciaTPF;

import java.util.List;

public interface InterfazDAO {
    public List obtenerTodos(String consulta);
    public Object obtenerUno(String consulta);
    public void agregar(Object objeto);
    public void modificar(Object objeto);
    public void eliminar(Object objeto);
}
