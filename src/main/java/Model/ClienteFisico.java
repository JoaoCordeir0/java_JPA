package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author joaoc
 */
@Entity
// @DiscriminatorValue(value = "F")
public class ClienteFisico extends Cliente implements Serializable {

    @Column
    private String cpf;
    
    @Column
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public String getCpf() {
        return cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
