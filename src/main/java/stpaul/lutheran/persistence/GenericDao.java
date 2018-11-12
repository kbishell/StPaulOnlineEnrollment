package stpaul.lutheran.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import stpaul.lutheran.entity.Users;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Generic dao.
 *
 * @param <T> the type parameter
 * @author kortneyBishell
 */
public class GenericDao<T> {

    private Class<T> type;

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Instantiates a new Generic dao.
     */
    public GenericDao() {
    }

    /**
     * Instantiates a new Generic dao.
     *
     * @param type the type
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    /**
     * Gets all entities.
     *
     * @return the all entities
     */
    public List<T> getAll() {
        logger.debug("Searching for: {} 1");
            Session session = getSession();

        logger.debug("Searching for: {} 2");
            CriteriaBuilder builder = session.getCriteriaBuilder();

        logger.debug("Searching for: {} 3");
            CriteriaQuery<T> query = builder.createQuery(type);

        logger.debug("Searching for: {} 4");
            Root<T> root = query.from(type);

        logger.debug("Searching for: {} 4");
            query.select(root);
            List<T> list = session.createQuery(query).getResultList();

        logger.debug("Searching for: {} 5");
            session.close();

        logger.debug("Searching for: {} 6");
        logger.debug("Searching for: {} 7" + list.size());

            return list;
        }

    /**
     * Gets all entities by last name.
     *
     * @param lastName the last name to search by
     * @return the all entities
     */
    public List<T> getByLastName(String lastName) {

            logger.debug("Searching for: {}", lastName);

            Session session = getSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> query = builder.createQuery(type);
            Root<T> root = query.from(type);
            Expression<String> propertyPath = root.get("lastName");
            query.where(builder.like(propertyPath, "%" + lastName + "%"));
            List<T> list = session.createQuery(query).getResultList();
            session.close();
            return list;
        }

    /**
     * Gets an entity by id
     *
     * @param <T> the type parameter
     * @param id  entity id to search by
     * @return an entity
     */
    public <T>T getById(int id) {
            Session session = getSession();
            T entity = (T)session.get(type, id);
            logger.debug("********************************************" + id);
            session.close();
            return entity;
        }

    /**
     * update entity
     *
     * @param entity to be inserted or updated
     */
    public void saveOrUpdate(T entity) {
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(entity);
            transaction.commit();
            session.close();
        }

    /**
     * update entity
     *
     * @param entity to be inserted or updated
     * @return id of the inserted entity
     */
    public int insert(T entity) {
            int id = 0;
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            id = (int)session.save(entity);
            transaction.commit();
            session.close();
            return id;
        }

    /**
     * Delete a users
     *
     * @param entity Users to be deleted
     */
    public void delete(T entity) {
            Session session = getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
            session.close();
        }


    /**
     * Get entity by property (exact match)
     * sample usage: getByPropertyEqual("lastName", "Curry")
     *
     * @param propertyName entity property to search by
     * @param value        value of the property to search for
     * @return list of entities meeting the criteria search
     */
    public List<T> getByPropertyEqual(String propertyName, String value) {
            Session session = getSession();

            logger.debug("Searching for users with " + propertyName + " = " + value);

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> query = builder.createQuery(type);
            Root<T> root = query.from(type);
            query.select(root).where(builder.equal(root.get(propertyName), value));
            List<T> list = session.createQuery( query ).getResultList();

            session.close();
            return list;
        }

    /**
     * Get users by property (like)
     * sample usage: getByPropertyLike("lastName", "C")
     *
     * @param propertyName entity property to search by
     * @param value        value of the property to search for
     * @return list of userss meeting the criteria search
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
            Session session = getSession();

            logger.debug("Searching for users with {} = {}",  propertyName, value);

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> query = builder.createQuery(type);
            Root<T> root = query.from(type);
            Expression<String> propertyPath = root.get(propertyName);

            query.where(builder.like(propertyPath, "%" + value + "%"));

            List<T> list = session.createQuery( query ).getResultList();
            session.close();
            return list;
        }
}

