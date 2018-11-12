package stpaul.lutheran;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.entity.Student;
import stpaul.lutheran.persistence.GenericDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.beans.Transient;
import java.util.List;



@Path("/daycareSearch")
public class DaycareService {

        private final Logger logger = LogManager.getLogger(this.getClass());

        private GenericDao dao = new GenericDao(Student.class);


        @GET
        @Produces("application/json")
        public Response getContactInformation() {
                logger.error("I am in getContactInformation");

                List<Student> students = (List<Student>)dao.getAll();


                logger.error("I am in getContactInformation" + students);

                return Response.status(200).entity(students).build();
        }
}
