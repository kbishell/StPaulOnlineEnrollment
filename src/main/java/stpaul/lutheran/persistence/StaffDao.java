package stpaul.lutheran.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import stpaul.lutheran.entity.Staff;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 *@author kortneyBishell
 */
public class StaffDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


        /**
         * Gets all staffs.
         *
         * @return the all staffs
         */
        public List<Staff> getAllStaff() {
            //List<Staff> staff = new List<Staff>;

            Session session = sessionFactory.openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Staff> query = builder.createQuery(Staff.class);
            Root<Staff> root = query.from(Staff.class);

            List<Staff> staff = session.createQuery(query).getResultList();
            session.close();
            return staff;
        }

        /**
         * Gets all staffs by last name.
         * @param lastName the last name to search by
         * @return the all staffs
         */
        public List<Staff> getStaffsByLastName(String lastName) {

            logger.debug("Searching for: {}", lastName);

            Session session = sessionFactory.openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Staff> query = builder.createQuery(Staff.class);
            Root<Staff> root = query.from(Staff.class);
            Expression<String> propertyPath = root.get("lastName");
            query.where(builder.like(propertyPath, "%" + lastName + "%"));
            List<Staff> staff = session.createQuery(query).getResultList();
            session.close();
            return staff;
        }

        /**
         * Gets a staff by id
         * @param id staffs id to search by
         * @return a staff
         */
        public Staff getById(int id) {
            Session session = sessionFactory.openSession();
            Staff staff = session.get(Staff.class, id);
            logger.debug("********************************************" + id);
            session.close();
            return staff;
        }

        /**
         * update staff
         * @param staff  Staff to be inserted or updated
         */
        public void saveOrUpdate(Staff staff) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(staff);
            transaction.commit();
            session.close();
        }

        /**
         * update staff
         * @param staff  Staff to be inserted or updated
         * @return id of the inserted staff
         */
        public int insert(Staff staff) {
            int id = 0;
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id = (int)session.save(staff);
            transaction.commit();
            session.close();
            return id;
        }

        /**
         * Delete a staff
         * @param staff Staff to be deleted
         */
        public void delete(Staff staff) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(staff);
            transaction.commit();
            session.close();
        }


        /**
         * Get staff by property (exact match)
         * sample usage: getByPropertyEqual("lastName", "Curry")
         *
         * @param propertyName entity property to search by
         * @param value value of the property to search for
         * @return list of staffs meeting the criteria search
         */
        public List<Staff> getByPropertyEqual(String propertyName, String value) {
            Session session = sessionFactory.openSession();

            logger.debug("Searching for staff with " + propertyName + " = " + value);

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Staff> query = builder.createQuery( Staff.class );
            Root<Staff> root = query.from( Staff.class );
            query.select(root).where(builder.equal(root.get(propertyName), value));
            List<Staff> staff = session.createQuery( query ).getResultList();

            session.close();
            return staff;
        }

        /**
         * Get staff by property (like)
         * sample usage: getByPropertyLike("lastName", "C")
         *
         * @param propertyName entity property to search by
         * @param value value of the property to search for
         * @return list of staffs meeting the criteria search
         */
        public List<Staff> getByPropertyLike(String propertyName, String value) {
            Session session = sessionFactory.openSession();

            logger.debug("Searching for staff with {} = {}",  propertyName, value);

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Staff> query = builder.createQuery( Staff.class );
            Root<Staff> root = query.from( Staff.class );
            Expression<String> propertyPath = root.get(propertyName);

            query.where(builder.like(propertyPath, "%" + value + "%"));

            List<Staff> staff = session.createQuery( query ).getResultList();
            session.close();
            return staff;
        }


}

