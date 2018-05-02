package fr.paquet.framework;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.vaadin.crudui.crud.AddOperationListener;
import org.vaadin.crudui.crud.DeleteOperationListener;
import org.vaadin.crudui.crud.FindAllCrudOperationListener;
import org.vaadin.crudui.crud.UpdateOperationListener;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.data.Property;

@SuppressWarnings({ "serial", "rawtypes" })
public class ErasmusContainer extends ErasmusFactory implements FindAllCrudOperationListener {
	private Class<ErasmusItem> entityClass = null;
	private AnnotationInfo info = null;

	/**
	 * @return le nom de la table
	 */
	private String getTablename() {
		return info.getTableName();
	}

	public Property<Object> getProperty(ErasmusItem entity, String mappedBy) {
		return null;
	}

	public ErasmusContainer(Class entityClass) {
		this.entityClass = entityClass;
		info = new AnnotationInfo(entityClass);
	}

	/**
	 * Fait un select * de la table
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection findAll() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<ErasmusItem> cq = (CriteriaQuery<ErasmusItem>) cb.createQuery(entityClass);
		Root<ErasmusItem> rootEntry = (Root<ErasmusItem>) cq.from(entityClass);
		CriteriaQuery<ErasmusItem> all = cq.select(rootEntry);
		TypedQuery<ErasmusItem> allQuery = getEntityManager().createQuery(all);
		return (Collection<ErasmusItem>) allQuery.getResultList();
	}

	/**
	 * Cette methode permet de définir le traitement effectué pour ajouter un
	 * nouvel element
	 * 
	 * @return
	 */
	@SuppressWarnings({ "serial", "rawtypes" })
	public AddOperationListener add() {
		return new AddOperationListener() {

			@Override
			public Object perform(Object domainObject) {
				return create("CRUDVIEW", (ErasmusItem) domainObject);
			}
		};
	}

	@SuppressWarnings("serial")
	public DeleteOperationListener delete() {
		return new DeleteOperationListener() {
			@Override
			public void perform(Object domainObject) {
				softDelete("CRUDVIEW", (ErasmusItem) domainObject);
			}
		};
	}

	@SuppressWarnings("serial")
	public UpdateOperationListener update() {
		return new UpdateOperationListener() {

			@Override
			public Object perform(Object domainObject) {
				return update("CRUDVIEW", (ErasmusItem) domainObject);
			}
		};
	}
}
