# eclipse-TM


##  
fork from https://git.eclipse.org/c/tm/org.eclipse.tm.terminal.git  

##  how to compile  
*  make sure you have installed MAVEN  
*  open CMD terminal of Windows  
*  execute the cmd: mvn clean verify   

###  OR:  
*  open IDE-J2EE4.5
*  Import--Existing Maven Projects--choose the directory of project, you will see "terminal-parent" if completed
*  open Terminal, cd dir of this project  
*  run: mvn compile    

###  Maven cmd  
package: mvn package  
clean:  mvn clean  
build eclipse project:  mvn eclipse:eclipse
install jar to local Repo:  mvn install

###  how to use  

The project has been compiled already.  
The target file is in the directory:   
repos\org.eclipse.tm.terminal.repo\target\repository, "plugins" and "features" is usefull,  
you can install the plugin named TM in Eclipse IDE by copying the two directory into your eclipse main directory.  
 
