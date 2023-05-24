package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author joaoc
 */
@Entity
// Para definir que as tres classes serão salvas em uma tabela so
/* @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo" )
@DiscriminatorValue(value = "C") */

// Para criar tres tabelas, sendo uma para superclasse e uma para cada subclasse
// sendo que a junção dos dadosse daria por id da superclasse
/* @Inheritance(strategy = InheritanceType.JOINED) */

// Uma tabela para cada classe concreta
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
        
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cliente[ id=" + id + " ]";
    }
    
}
