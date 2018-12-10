# Design/Code Review 3

## Project:

### Developer:

#### Reviewer:

|Category|Criteria|Rating/Comments|
|--------|---------|---------------|
|**Project Overview**|| |
||Which planned functionality has been met? | Converts text to audio from all different languages|
|| What planned functionality has not been met? |John wants to have a better format for deleting each audio|
||Describe the GitHub history and what it demonstrates about the project progress during the semester.| John has been diligent on implementing each weekly exercise into his project. All his work seems to be on target.|
||Describe how peer and instructor feedback/recommendations were incorporated into the project.|Some recommendations are using a generic dao and getting the vocalizations for an user, rather than filtering through all of them manually. Both of these have been implemented for more efficient code  |
||Other comments/notes?|Great job overall - I love the styling |
|**JSPs**|| |
||Evaluate the JSPs for templating, business logic, data validation, overall look and feel.| All jsp's look good. The header, footer, etc are split up into their own jsp and then included into index. There is data validation when logging in and entering some of the fields for getting audio|
||Other comments/notes?| |
|**Java code quality**|Evaluate the code quality for the following and identify specific areas for improvement (class, method or line number) <li>single-purpose methods <li>well-structured project <li>descriptive naming of packages, classes, methods, variables <li>classes appropriately-sized  (no monster classes) <li> CPD (copy paste detection, meaning are the same lines of code repeated?) <li>are there candidates for super/subclass relationships, abstract classes, interfaces? <li>are any values hard-coded that should be in a properties file? <li>proper exception handling <li>proper error reporting to the user <li> code documentation |Looking through the code I do no see any issues that jump out to me. I think the controllers are very well labeled and broken out. You have proper exception handling. |Other comments/notes?| |
|**Logging**|Evaluate the use of logging, for example:<li>appropriate use of logging statements in the code for error logging and debugging <li>logging levels used - info, debug, error <li> no occurrences of  System.out.printlns or printStackTrace() <li> logging works on AWS deploy|logging looks good, you could add hibernate logging. There are no system.outs or printstacktraces|Other comments/notes?| |
|**Unit Tests**|Evaluate the unit tests, for example: <li>tests are truly a unit test rather than a high level functional test <li>test data is appropriately cleaned up or handled <li> there is full coverage of methods that perform business logic or utility functions <li>redundant code is eliminated by using set up and tear down methods, i.e., @Before, @After
||Other comments/notes?| |
|**Security**|Evaluate authentication/authorization:| It is working locally and on AWS. There is also validation/error page to log in|
||Is it implemented correctly and working locally as well as on AWS?
||Other comments/notes?| |
|**Web Service/API integration**|Evaluate the service/api integration, for example: <li> Which service/api is implemented? <li>How is  error handling of the service implemented? For example, what happens if the service is not available?| |
||Other comments/notes?| |
|**Independent research topic**| What is the independent research topic?| |
||Is the independent research topic/technique implemented in the project?|Yes, John has implemented javascript, saves a file directly in tomcat by the session  |
||Other comments/notes?| |
|**Deployment**| Has the application been successfully deployed to AWS?| yes|
||Is the hosted application fully functioning?|Yes it is fully functioning but John is still adding more minor functionality/capabilities |
||Other comments/notes?| |
  