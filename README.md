# Design-API


## Mohammad Osama Al Refai ic18b079

Task:

you want to develop a quick API that helps you calculate the area of a form. Your API
should be able to:
  - Return the value of the area (circle, square)
  
  


You should implement a REST-based server in Java (use Spring Boot). The service should
be able to return the desired information using REST.

Use GitHub or Azure DevOps for the project and follow the correct DevOps procedure. Use a
Kanban board to manage your User Stories and use a git branching model (preferable
gitflow) to manage your code. Track your development process by updating your Kanban
board and write at least one unit tests for every requirement. A Continuous Integration
pipeline that produces the finished software artifact should be implemented as well.


Document
  - the whole process
  - the user stories
  - the repository URL
  - the usage of the software
in a Readme file with explanatory text. Submit the code (including the .git folder and ALM
files) as a zip file (please put the Readme inside the zip file).
You can use external resources as long as you mark them: “ // taken from: <URL> ”
  
References
Formulas:
Circle: Area = π ⋅ value²
Square: Area = value2


Route Examples:
api/circle?value=3 → 28.27 (2 decimal places)
api/square?value=3 → 9
  
  
  
  As an ALM tool, Github was used. There was a Kanban-board created where the user stories were defined and converted to issues.
  From the issues, I have used the Create branch button to create feature branches.
  After implementing the issue, I have created pull requests to merge the changes back to the develop branch.
  
  I have used a CI/CD pipeline for continuous dev and testing, that can be seen in the Actions menu.
  
  Everything has been documented in by screenshots that can be found in the ./screenshots folder. 
  
  The develop branch is at the end of the project merged back to main and it is given a tag, to mark the release.
  
  

  
  


Usage

The API is based on REST principles and can be accessed by making a GET request to the specific endpoint.

To calculate the area of a circle, make a GET request to the endpoint api/circle and provide the value of the radius as a query parameter, e.g. api/circle?value=3

To calculate the area of a square, make a GET request to the endpoint api/square and provide the value of the side as a query parameter, e.g. api/square?value=3

The API will return the calculated area in decimal format with 2 decimal places.

The API also validates the input and return error message if invalid input is provided.
Endpoints
Endpoint	          Method	Description
api/circle	       GET	Calculate the area of a circle
api/square	       GET	Calculate the area of a square



