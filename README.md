Coverage: TBC

[My Final Presentation](documentation/Final-Presentation.pptx)

# **QA Assessment: 2**
# **_CRUD Application Hobby Project_**

## **_Introduction_**
This is my second of three assessments for the QA Academy. The project required a crud application which would allow the user to create, read, update and delete items in an entity. The application is required to have a functioning front-end through the usage of HTML, CSS and Javascript as well as a functioning back-end using Java and the Spring framework. The requirements for this project have been met through usage of various technologies described further in this document and consisted of: Git, Jira, Github, HTML, CSS, Bootstrap, Java, Spring and MySQL.

## **_Getting Started_**
In order to get started on the project I first needed to start by planning it. To achieve this I used Jira software so that I was able to work in an agile way. Having considered the user stories and tasks related to them for a complete project meeting the MVP I was able to start my sprint; thus moving onto the next step of creating some initial wireframes, carefully considering what whould be included in a desktop(Figure 1) and mobile (Figure 2) version of the web app in order to meet the user stories. Once these were complete I created an empty GitHub repository. Once the Github repository was created I then opened up Eclipse and started a new Spring project. Having done so allowed me to initiate the local repository as a git repository and create the README.md file and the LICENSE.md file. I then set a new remote repository equal to the one I had created in GitHub (Using the HTTPS key) and was ready to push my first commit.<br/>
Figure 1:<br/>
![Figure 1](documentation/Initial-wireframe-desktop.png)<br/>
Figure 2:<br/>
![Figure 2](documentation/Initial-wireframe-mobile.png)<br/>


## **_Project Planning_**
* **The UML diagram:** <br/> <img src="Documentation/controller-UML.png"><br/>
* [The risk assessment](documentation/QA-Assessment-2-RiskAssessment.pdf)<br/>
* [The risk assessment matrix](documentation/QA-Assessment-2-RiskAssessmentMatrix.pdf)<br/>

## **_Prerequisites_**

* **Github**<br/>

Github is a free platform to aid managing version control of your projects. a free account can be created [here](https://github.com/). Once the account is created you have access to Github's platform- within it you have our repository and can find lots of repositories from your colleagues or open source projects. <br/> <br/>

* **Jira Software** <br/>

Jira is free software used to implement Agile methodology using a Kanban board. All that is required is an account to get started however within the software there are instructions on connecting to GitHub for the use of commit messages within your Kanban board.


* **Git** <br/>

Git is the version control system used to communicate between your local machine and github. The latest version is 2.35.1 for windows and can be installed [here](https://git-scm.com/download/win). Unlike other software in this document, Git doesn't require any other special attention other than following the instructions in the installer and choosing the best options for your needs.


* **Java** <br/> 
*_Java needs to be installed in order to develop any java projects. It can be downloaded [here](https://jdk.java.net/java-se-ri/16)._*

Java 14 is the minimum requirement but downloading the latest version will guarantee you won't face issues and will definitely last longer if you're not someone who constantly searches for new updates in all their software. Once the file has been downloaded, locate it and click the executable jdk-"version number" file which will open a window, click next, then click next and next again, in the next window you can click clos which will start the installation. Next you need to set the environment variable on your machine, on windows search for environment variables in start, and click on the option which says "Edit the system environment variables" a system properties windows opens and you should click the environment variables button. Choose System variables and click new, in the pop up window create a variable named JAVA_HOME and the value should correspond to the path of the JDK folder, click ok. now scroll within the system variables windows to find Path, click on this and select edit, inside you need to append the path of the Java /bin folder to this path variable so reference the JAVA_HOME like this: %JAVA_HOME%\bin (make sure that there is a semi-colon before and after %JAVA_HOME%\bin).To test that this has saved, open command prompt, and type "java" and hit enter. If the Path variable has been configured correctly then the OS will run the file called "Java" in your JAVA_HOME /bin folder (Java.exe) and you should see this output:<br/>
<img src="documentation/Java-successful-install-output.png"> <br/>


* **Maven** <br/>
*_Can be downloaded from [here](https://maven.apache.org/)._*

Run the downloaded file like you did for java and then again navigate to the Environment Variables menu set two variables; M2_HOME and MAVEN_HOME - both of which should point to the path of your Maven install folder. (You need both, as certain programs reference Maven in different ways.) Now edit the Path variable in the same way we did for JAVA_HOME: %MAVEN_HOME%\bin; To verify that Maven is installed correctly, open a command line and enter the following command: mvn -version.


* **MySQL**<br/>

*_MySQL can be downloaded [here](https://dev.mysql.com/downloads/windows/installer/8.0.html)._*

Once downloaded run the installer. You may be see pop-ups asking to allow the installer to change your system - click ok/accept on these. Once the installer is running you should see a screen asking you to choose a Setup Type; choose Custom and click Next. Now you need to select what software is installed. You will need to select:
* The newest MySQL Server from MySQL Servers.
* The newest MySQL Workbench from Applications.
* The newest Samples and Examples from Documentation.<br/>

Once these are selected, click Next. You should now be on the Download page; click Execute. It should take a few moments for it all to be downloaded to your machine. Once the downloads are finished, click Next. You should now be on the Installation page; click Execute. It should take a few moments for the installation to finish. Once the installation is finished, click Next. You should now be on the Product Configuration page, click Next. You should now be on the Type and Networking page, click Next. You should now be on the Authentication Method page, click Next. You should now be on the Accounts and Roles page. Enter a password for the root (admin) account into the two password fields. (Use something easy to remember like pass or root because if you forget it you're going to have to re-install MySQL) Then, click Next. You should now be on the Windows Service page, click Next. You should now be on the Apply Configuration page, click Execute. Once the configuration has been successfully applied click Finish. You should now be on the Product Configuration page, click Next. You should now be on the Connect To Server page, enter the password and click Check. If the connection succeeded, click Next. You should now be on the Apply Configuration page, click Execute.
Once the configuration is applied, click Finish. You should now be back on the Product Configuration page, click Next again. You should now be on the Installation Complete page, click Finish. This will open MySQL Workbench.<br/>
Set up the MySQL environment variable
In the Start Menu, search for 'env' and click the option to edit system environment variables Click Environment Variables. In the bottom System Variables panel of this window, click New, then, in the window which opens, replicate the following setup: Variable Name: MYSQL_HOME. Variable Value: path to MySQL Server.
Click OK, then scroll in the bottom panel until you find the Path variable. Select it and click Edit, then New and add %MYSQL_HOME%\bin. Click OK recursively until all system windows are closed.

* **Eclipse**<br/>
*_Eclipse is and ide for Java, it can be downloaded for free [here](https://www.eclipse.org/downloads/)._* <br/>
When possible run the installer. You could get a security warning pop up to run this file. Select run if you are certain you are downloading from the site provided.<br/> ![Eclipse Installer 1](documentation/eclipse-installer-1.png)<br/>
The Eclipse Installer shows the packages available. You can search for the package you want to install or scroll through the list. ![Eclipse Installer 2](documentation/eclipse-installer-2.png)<br/>
Next you will need to specify the folder where you want Eclipse to be installed.<br/>
![Eclipse Installer 3](documentation/eclipse-installer-3.png) <br/>
Once the installation is complete you can launch Eclipse.<br/>
![Eclipse Installer 4](documentation/eclipse-installer-4.png)


* **Spring**<br/>
Spring is a framework which can be installed on Eclipse by navigating to 'Help' -> 'Eclipse Marketplace' -> Search for Spring tools 4 and install this. The file you will be looking for looks like this: <img src="documentation/Spring-tools-eclipse.png"><br/>

Once you have successfully installed this Eclipse add on you may go ahead and create a new spring project which will be described futher down. However right now just be aware that due this installation you may need to restart Eclipse and also all dependencies will be available to you when it comes to project creation.


* **VSCode**<br/>



* **PostMan**<br/>





## **_Deployment_**

Although this project is not a project which is being deployed I'd like to take the opportunity to demonstrate my knowledge of project deployment. Firstly deploying a project is what makes it live, until the project is deployed it can only be accessed within the repository so only code and any preview tools such as Gitpod's preview tool can be used to see a preview of what the live application would look like. Web applications will be deployed via Github settings, if being deployed via Github. However they can also be deployed via other means such as Heroku this would involve connecting the master branch to Heroku and then push your commits and deploying the app via the Heroku dashboard. <br/>

For local deployment of apps the end user can begin by navigating to the GitHub repository then clicking the Code drop down menu the user can choose to Download the ZIP file, unpackage locally and open with IDE (This route ends here).<br/>
Or alternatively copy the Git URL from the HTTPS dialogue box. Open the development editor of choice and open a terminal window in a directory of  choice. Then using the 'git clone' command in terminal followed by the copied git URL. Finally a project clone will be created locally on the users machine.

## **Built With**

* [Java](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html) - Programming Language

* [Maven](https://maven.apache.org/) - Dependency Management

* [Spring](https://spring.io/projects/spring-boot) - Creating a functioning back-end appliction.

* [HTML](https://www.w3schools.com/html/) - Hyper Text Markup Language for writing the visual aspects of the site.

* [CSS](https://www.w3schools.com/css/) - Used to make the HTML more visually apparent

* [Bootstrap](https://getbootstrap.com/) - Used to implement a mobile friendly design, and implemeting further CSS.

* [JavaScript](https://www.javascript.com/)- Used to communicate between the front-end and the back-end.

* [MySQL](https://dev.mysql.com/downloads/windows/installer/8.0.html) - Relational Database (SQL) community server.

## **Versioning**

We use [SemVer](http://semver.org/) for versioning.<br/>

**This is version 1.0.0**

## **Authors**

* **Mateusz Chocianowski** - *Project planning, creation, updating.*

## **License**

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*
