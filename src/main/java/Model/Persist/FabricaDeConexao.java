package Model.Persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author joaoc
 */
public class FabricaDeConexao {
    
    private static EntityManagerFactory fabrica = null;
    private static EntityManager gerenciaDB = null;
    
    public static EntityManager getEntityManager()
    {
        if (fabrica == null)
        {
            fabrica = Persistence.createEntityManagerFactory("persistencia_jpu");
            
            gerenciaDB = fabrica.createEntityManager();
        }        
        return gerenciaDB;
    }
    
    public static
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        void closeConn()
    {
        if (fabrica != null)
        {
            gerenciaDB.close();
            fabrica.close();
            gerenciaDB = null;
            fabrica = null;
        }
    }    
}
