package fr.paquet.framework.authentication;

import fr.paquet.framework.ErasmusItem_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-05-02T11:49:17.359+0200")
@StaticMetamodel(User.class)
public class User_ extends ErasmusItem_ {
	public static volatile SingularAttribute<User, String> login;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> salt;
	public static volatile SingularAttribute<User, String> nom;
	public static volatile SingularAttribute<User, String> prenom;
	public static volatile ListAttribute<User, Role> roles;
	public static volatile ListAttribute<User, Permission> permissions;
}
