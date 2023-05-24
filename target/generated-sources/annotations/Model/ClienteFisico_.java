package Model;

import Model.Sexo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-24T20:54:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(ClienteFisico.class)
public class ClienteFisico_ extends Cliente_ {

    public static volatile SingularAttribute<ClienteFisico, String> cpf;
    public static volatile SingularAttribute<ClienteFisico, Sexo> sexo;

}