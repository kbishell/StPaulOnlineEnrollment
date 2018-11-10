package stpaul.lutheran;

import stpaul.lutheran.entity.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/services/daycareSearch")
public class DaycareService {
        // The Java method will process HTTP GET requests
        @GET
        // The Java method will produce content identified by the MIME Media type "text/plain"
        @Produces("application/json")
        public Response getContactInformation(@PathParam("firstName") Student firstName, Student lastName) {
            /*String contactInformation = "Daycare Search";*/

            // here is where we will search students and contacts


            /*return Response.status(200).entity(contactInformation).build();*/
        }


}
