# Hello Java Server Pages

---

### Introduction

This project is the next step behind my Servlets project, in preparing for Java Server Faces. We create a servlet, which 
serves the /greet page. If the content of the name variable is null (i.e. we just access /greet without a name) then we 
redirect to index.jsp. From this page, we can enter our name. Then we post from the submit button, which is handled by 
the servlet, and redirects to greeting.jsp with the name attribute set by the text box from index.jsp.


---

### Usage with Tomcat

We simply run the Gradle war subroutine to build a war archive. We then simply upload that file to the tomcat webapp 
directory, and then we can access our site at:

    localhost:8080/HelloJSP/greet

(Note that the exact hostname:port will depend on your tomcat configuration)

---

