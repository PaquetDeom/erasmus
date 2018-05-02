package fr.paquet.framework.authentication;

import fr.paquet.framework.ErasmusItem_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-02T11:49:17.294+0200")
@StaticMetamodel(Permission.class)
public class Permission_ extends ErasmusItem_ {
	public static volatile SingularAttribute<Permission, Integer> id;
	public static volatile SingularAttribute<Permission, String> permission;
	public static volatile SingularAttribute<Permission, User> user;
}
