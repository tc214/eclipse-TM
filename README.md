# eclipse-TM  
This a MAVEN project of TM plugin.


##  
forked from https://git.eclipse.org/c/tm/org.eclipse.tm.terminal.git  

##  how to compile    
###  way1:use cmd
*  make sure you have installed MAVEN  
*  open CMD terminal of Windows  
*  execute the cmd: mvn clean verify   

###  way2:use eclipse    
*  open IDE-J2EE4.5
*  Import--Existing Maven Projects--choose the directory of project, you will see "terminal-parent" if completed
*  open Terminal, cd dir of this project  
*  run: mvn compile    

##  Maven commands:  
*  package: mvn package  
*  clean:  mvn clean  
*  build to eclipse project:  mvn eclipse:eclipse  

*  install jar to local Repo:  mvn install

##  how to use  

The project has been compiled already.  
The target file is in the directory:   
*  repos\org.eclipse.tm.terminal.repo\target\repository, "plugins" and "features" is usefull,  
*  you can install this plugin named TM in Eclipse IDE by copying the two directory into your eclipse main directory.  
 
