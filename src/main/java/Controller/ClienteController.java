package Controller;

import Model.ClienteFisico;
import Model.ClienteFisicoDAO;
import Model.ClienteJuridico;
import Model.ClienteJuridicoDAO;
import static Model.Sexo.MASCULINO;
import static Model.Sexo.FEMININO;

/**
 *
 * @author joaoc
 */
public class ClienteController {

    public ClienteController() {
    }
   
    /* 
    Cliente FISICO
    */
    public void insereClienteFisico(String nome, String cpf, String sexo) 
    {
        ClienteFisico cli = new ClienteFisico();       
        cli.setNome(nome);
        cli.setCpf(cpf);
        if (sexo.equals("masculino"))                    
            cli.setSexo(MASCULINO);         
        else         
            cli.setSexo(FEMININO);        
        
        ClienteFisicoDAO cliFisico = new ClienteFisicoDAO();
        cliFisico.insert(cli);
    }
    
    public String buscaClienteFisico(Long id)
    {
        ClienteFisico result = (new ClienteFisicoDAO()).getByID(id);
             
        return "Nome -> " + result.getNome() + "\nCPF: " + result.getCpf() + "\nSEXO: " + result.getCpf();
    }
    
    public void removeClienteFisico(Long id)
    {
        (new ClienteFisicoDAO()).removeByID(id);
    }
    
    /*
    Cliente JURIDICO
    */    
    public void insereClienteJuridico(String nome, String cnpj) 
    {
        ClienteJuridico cli = new ClienteJuridico();       
        cli.setCnpj(cnpj);
        
        (new ClienteJuridicoDAO()).insert(cli);
    }
    
    public String buscaClienteJuridico(Long id)
    {
        ClienteJuridico result = (new ClienteJuridicoDAO()).getByID(id);
             
        return "Nome -> " + result.getNome() + "\nCNPJ: " + result.getCnpj();
    }
    
    public void removeClienteJuridico(Long id)
    {
        (new ClienteJuridicoDAO()).removeByID(id);
    }
}
