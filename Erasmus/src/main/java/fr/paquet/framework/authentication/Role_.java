package fr.paquet.framework.authentication;

import fr.paquet.framework.ErasmusItem_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-02T11:49:17.353+0200")
@StaticMetamodel(Role.class)
public class Role_ extends ErasmusItem_ {
	public static volatile SingularAttribute<Role, Integer> id;
	public static volatile SingularAttribute<Role, String> roleName;
	public static volatile SetAttribute<Role, User> users;
}
