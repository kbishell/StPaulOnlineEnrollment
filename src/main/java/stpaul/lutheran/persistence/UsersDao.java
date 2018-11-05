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
 *@author kortneyBishell
 */
public class UsersDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


        /**
         * Gets all userss.
         *
         * @return the all userss
         */
        public List<Users> getAllUsers() {
            //List<Users> users = new List<Users>;

            Session session = sessionFactory.openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Users> query = builder.createQuery(Users.class);
            Root<Users> root = query.from(Users.class);

            List<Users> users = session.createQuery(query).getResultList();
            session.close();
            return users;
        }

        /**
         * Gets all userss by last name.
         * @param lastName the last name to search by
         * @return the all userss
         */
        public List<Users> getUsersByLastName(String lastName) {

            logger.debug("Searching for: {}", lastName);

            Session session = sessionFactory.openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Users> query = builder.createQuery(Users.class);
            Root<Users> root = query.from(Users.class);
            Expression<String> propertyPath = root.get("lastName");
            query.where(builder.like(propertyPath, "%" + lastName + "%"));
            List<Users> users = session.createQuery(query).getResultList();
            session.close();
            return users;
        }

        /**
         * Gets a users by id
         * @param id userss id to search by
         * @return a users
         */
        public Users getById(int id) {
            Session session = sessionFactory.openSession();
            Users users = session.get(Users.class, id);
            logger.debug("********************************************" + id);
            session.close();
            return users;
        }

        /**
         * update users
         * @param users  Users to be inserted or updated
         */
        public void saveOrUpdate(Users users) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(users);
            transaction.commit();
            session.close();
        }

        /**
         * update users
         * @param users  Users to be inserted or updated
         * @return id of the inserted users
         */
        public int insert(Users users) {
            int id = 0;
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id = (int)session.save(users);
            transaction.commit();
            session.close();
            return id;
        }

        /**
         * Delete a users
         * @param users Users to be deleted
         */
        public void delete(Users users) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(users);
            transaction.commit();
            session.close();
        }


        /**
         * Get users by property (exact match)
         * sample usage: getByPropertyEqual("lastName", "Curry")
         *
         * @param propertyName entity property to search by
         * @param value value of the property to search for
         * @return list of userss meeting the criteria search
         */
        public List<Users> getByPropertyEqual(String propertyName, String value) {
            Session session = sessionFactory.openSession();

            logger.debug("Searching for users with " + propertyName + " = " + value);

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Users> query = builder.createQuery( Users.class );
            Root<Users> root = query.from( Users.class );
            query.select(root).where(builder.equal(root.get(propertyName), value));
            List<Users> users = session.createQuery( query ).getResultList();

            session.close();
            return users;
        }

        /**
         * Get users by property (like)
         * sample usage: getByPropertyLike("lastName", "C")
         *
         * @param propertyName entity property to search by
         * @param value value of the property to search for
         * @return list of userss meeting the criteria search
         */
        public List<Users> getByPropertyLike(String propertyName, String value) {
            Session session = sessionFactory.openSession();

            logger.debug("Searching for users with {} = {}",  propertyName, value);

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Users> query = builder.createQuery( Users.class );
            Root<Users> root = query.from( Users.class );
            Expression<String> propertyPath = root.get(propertyName);

            query.where(builder.like(propertyPath, "%" + value + "%"));

            List<Users> users = session.createQuery( query ).getResultList();
            session.close();
            return users;
        }
}

