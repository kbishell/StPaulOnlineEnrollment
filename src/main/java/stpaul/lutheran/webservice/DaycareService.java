package stpaul.lutheran.webservice;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
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
import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * The type Daycare service.
 */
@Path("/students")
public class DaycareService {

        private final Logger logger = LogManager.getLogger(this.getClass());

        private GenericDao dao = new GenericDao(Student.class);

        /*@GET
        @Produces("text/plain")
        public Response getContactInformation() {

                List<Student> students = (List<Student>)dao.getAll();

                String student = students.toString();

                return Response.status(200).entity(student).build();
        }*/

        /**
         * Gets contact information.
         *
         * @return the contact information
         * @throws Exception the exception
         */
        @GET
        @Produces("application/json")
        public Response getStudentInformation() throws Exception{

                List<Student> students = (List<Student>) dao.getAll();

                String jsonInString = toJson(students);

                return Response.status(200).entity(jsonInString).build();
        }


        private String toJson(List<Student> students) throws Exception{

                ObjectMapper mapper = new ObjectMapper();

                String jsonInString = "";

                jsonInString = mapper.writeValueAsString(students);

                return jsonInString;
        }

       /*private void getContactInformation(Students id) throws Exception{




        }*/


        /**
         * Gets contact information.
         *
         * @param idString the id string
         * @return the contact information
         */
        @GET
        @Path("{id}")
        @Produces("text/plain")
        public Response getContactInformation(@PathParam("id") String idString) {


                int id = Integer.parseInt(idString);

                Student student = (Student)dao.getById(id);

                //take student id that you have and find all the contacts matching it

                String sql = "Select * from Student_Contact where studentID = contactID";

                String reply = student.toString();

                return Response.status(200).entity(reply).build();
        }
}
