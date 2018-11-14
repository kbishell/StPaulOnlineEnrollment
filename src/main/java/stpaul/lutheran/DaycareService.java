package stpaul.lutheran;

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



@Path("/daycareSearch")
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

        @GET
        @Produces("application/json")
        public Response getContactInformation() {

                List<Student> students = (List<Student>) dao.getAll();
                logger.error(students);

                String jsonInString = toJson(students);
                logger.error("My jsonInString, in getContactInformation" + jsonInString);
                return Response.status(200).entity(jsonInString).build();
        }


        //Object writer - writeValue(JsonGenerator)
      /*  private String toJson(List<Student> students) {
                logger.error("I am in toJson");
                ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                String jsonInString = "";

                try {
                        logger.error("I am in the try");
                        //Object to JSON in String
                        jsonInString = ow.writeValueAsString(students);
                        logger.error("My jsonInString, after writeValueAsString" + jsonInString);
                } catch (JsonGenerationException e) {
                        e.printStackTrace();
                } catch (JsonMappingException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                } finally {
                        logger.error("My jsonInString, in finally" + jsonInString);
                        return jsonInString;
                }
        }*/

        private String toJson(List<Student> students) {
                logger.error("I am in toJson" + students);
                ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                String jsonInString = "";

                try {
                        logger.error("I am in the try");
                        //Object to JSON in String
                        jsonInString = ow.writeValueAsString((Object)students);
                        logger.error("My jsonInString, after writeValueAsString" + jsonInString);
                } catch (JsonGenerationException e) {
                        e.printStackTrace();
                } catch (JsonMappingException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                } finally {
                        logger.error("My jsonInString, in finally" + jsonInString);
                        return jsonInString;
                }
        }


        @GET
        @Path("{id}")
        @Produces("text/plain")
        public Response getContactInformation(@PathParam("id") String idString) {

                int id = Integer.parseInt(idString);

                Student student = (Student)dao.getById(id);

                String reply = student.toString();

                return Response.status(200).entity(reply).build();
        }
}
