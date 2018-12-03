package stpaul.lutheran.webservice;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.scene.effect.SepiaTone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.entity.Contact;
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
import java.util.Set;


/**
 * The type Daycare service.
 */
@Path("/students")
public class DaycareService {

        private final Logger logger = LogManager.getLogger(this.getClass());

        private GenericDao dao = new GenericDao(Student.class);

        /**
         * Gets contact information.
         *
         * @return the contact information
         * @throws Exception the exception
         */
        @GET
        @Path("{guid}")
        @Produces("application/json")
        public Response getStudentInformation(@PathParam("guid") String guid) throws Exception{
                String access = "96b7ccce-5d5f-42f7-9701-1d53941f39a3";

                String jsonInString;

                if (guid.equals(access)) {
                        List<Object> students = (List<Object>) dao.getAll();

                        jsonInString = toJson(students);
                } else {
                        jsonInString = "{\"Error\":\"Yall's keys is invalid k'\"}";
                }
                return Response.status(200).entity(jsonInString).build();

        }


        private String toJson(List<Object> students) throws Exception{

                ObjectMapper mapper = new ObjectMapper();

                String jsonInString = "";

                jsonInString = mapper.writeValueAsString(students);

                return jsonInString;
        }

        /**
         * Gets contact information.
         *
         * @param idString the id string
         * @return the contact information
         */
        @GET
        @Path("{guid}/{id}")
        @Produces("application/json")
        public Response getContactInformation(@PathParam("id") String idString, @PathParam("guid") String guid) throws Exception {

                String access = "96b7ccce-5d5f-42f7-9701-1d53941f39a3";

                String jsonInString = "";

                if (guid.equals(access)) {

                        int id = Integer.parseInt(idString);

                        Student student = (Student)dao.getById(id);

                        List<Contact> contact = student.getContacts();

                        ObjectMapper mapper = new ObjectMapper();

                        jsonInString = mapper.writeValueAsString(contact);

                } else {
                        jsonInString = "{\"Error\":\"Yall's keys is invalid k'\"}";
                }

                return Response.status(200).entity(jsonInString).build();
        }
}
