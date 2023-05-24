package Model;

import Model.Persist.FabricaDeConexao;
import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author joaoc
 */
public class ClienteFisicoDAO {
    
    private EntityManager gerenciaDB = null;

    public ClienteFisicoDAO() {
        // Obter o gerenciador de conexao com o banco de dados
        gerenciaDB = FabricaDeConexao.getEntityManager();
    }
    
    // Aqui começam os métodos para gerenciamento e manipulação dos dados da entidade ClienteFisico no DB
    
    public void insert(ClienteFisico cli)
    {
        // Qualquer comando de alteração no banco precisa de um comando de controle de transacao
        gerenciaDB.getTransaction().begin();
        gerenciaDB.persist(cli);                
        gerenciaDB.getTransaction().commit();        
    }
    
    public ClienteFisico getByID(Long id)
    {
        // Para obter o objeto com seus respectivos dados de uma tabela, dado o seu ID, use o método find
        // = ( select * from tabela where id = ?)
        
        return gerenciaDB.find(ClienteFisico.class, id);
    }
    
    /**
     * Método para alterar um cliente fisico pelo seu id
     * @input
     * @param id
     * @param value
     * @param newValue 
     * @throws SQLException
     */
    public void update(Long id, String value, String newValue) throws SQLException
    {
        // Passo 1 - obter a instancia gerenciada
        ClienteFisico cli = getByID(id);
        
        if (cli != null)
        {
            gerenciaDB.getTransaction().begin();
            
            switch(value)
            {
                case "nome":
                    cli.setNome(newValue);
                    break;
                case "cpf":
                    cli.setCpf(newValue);
                    break;
                //case "sexo":
                //    cli.setSexo(newValue);
                //    break;
            }
            
            gerenciaDB.persist(cli);
            
            gerenciaDB.getTransaction().commit();            
        }
        else
        {
            // O cliente não foi encontrado
            throw new SQLException("ID não encontrado");
        }
    }
    
    /**
     * Método que mostra como fazer a alteração com uso do método merge, apenas o titulo de demonstração
     */
    public void updateNameWithMerge(Long id, String newValue)
    {
        // Seto as propriedades a serem alteradas e o id de quem vai receber a alteração
        ClienteFisico cli = new ClienteFisico();
        cli.setId(id);
        cli.setNome(newValue);
                
        gerenciaDB.getTransaction().begin(); 
        
        gerenciaDB.merge(cli);
            
        gerenciaDB.getTransaction().commit(); 
    }
    
    public void removeByID(Long id)
    {
        // Seto as propriedades a serem alteradas e o id de quem vai receber a alteração
        ClienteFisico cli = new ClienteFisico();
        cli.setId(id);
                        
        gerenciaDB.getTransaction().begin(); 
        
        gerenciaDB.remove(cli);
            
        gerenciaDB.getTransaction().commit(); 
    }
}
