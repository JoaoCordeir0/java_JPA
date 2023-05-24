package Model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author joaoc
 */
@Entity
// @DiscriminatorValue(value = "J")
public class ClienteJuridico extends Cliente implements Serializable {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
