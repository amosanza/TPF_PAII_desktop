package persistenciaTPF;

import java.util.List;
import modeloDatosTPF.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class DAOhb implements InterfazDAO {
           
    public DAOhb() {
    }
       
    @Override
    public List obtenerTodos(String consulta) {
        Session sesion = iniciarSesion();
        Query query = sesion.createQuery(consulta);
        List resultado = query.list();
        HibernateUtil.closeSessionAndUnbindFromThread();
        return resultado;
    }

    @Override
    public Object obtenerUno(String consulta) {
        Session sesion = iniciarSesion();
        Query query = sesion.createQuery(consulta);
        Object resultado = query.uniqueResult();
        HibernateUtil.closeSessionAndUnbindFromThread();
        return resultado;
    }


    @Override
    public void agregar(Object min) {
        Session sesion = iniciarSesion();
        sesion.beginTransaction();
        sesion.save(min);
        sesion.getTransaction().commit();
        HibernateUtil.closeSessionAndUnbindFromThread();
    }

    @Override
    public void eliminar(Object min) {
        Session sesion = iniciarSesion();
        sesion.beginTransaction();
        sesion.delete(min);
        sesion.getTransaction().commit();
        HibernateUtil.closeSessionAndUnbindFromThread();
    }

    @Override
    public void modificar(Object min) {
        Session sesion = iniciarSesion();
        sesion.beginTransaction();
        sesion.update(min);
        sesion.getTransaction().commit();
        HibernateUtil.closeSessionAndUnbindFromThread();
    }
    
    public Session iniciarSesion(){
        HibernateUtil.openSessionAndBindToThread();
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
}
