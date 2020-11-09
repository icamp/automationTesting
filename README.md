> automation notes to self 

# Starting an Appium project in Eclipse using Graddle

## Install Eclipse
[Download](https://www.eclipse.org/downloads/)

## Create a Gradle project and add dependencies
- launch Eclipse

- create a new  Graddle Project
    * click file > new > other
    * expand Graddle > click Gradle Project > next > next > enter a Project Name > next > 
    * next (latest graddle wrapper should begin downloading) >
    * click finish

- add required dependencies
    * expand the project files
    * to see already present dependencies expand the file Project and External Dependencies
    * open build.graddle file
    * under "repositories" replace jcenter() with mavenCentral() repository
    * in browser navigate to [maven central repository](https://mvnrepository.com)
    * search for "appium java client" library (it is required to sent the driver commands to the appium server)
    * click the [java-client link](https://mvnrepository.com/artifact/io.appium/java-client)
    * click on the latest version
    * click on the Gradle tab > coppy content 
    * go back to Eclipse > paste the code under "dependecies" section (do not delete the existing code under dependencies) > save
    * right-click the build.graddle file > select Gradle > click "Refresh Gradle Project"  > download should start for the java client library and for all the associated dependent libraries which are automatically added to the project build path
    * expand file "Project and External Dependencies" and confirm the java-client library is listed

## Start the Appium server

## Start the Android Virtual Device

## Write Java program to create a new Appium session
> [using Appium Desired Capabilities](http://appium.io/docs/en/writing-running-appium/caps/)

    - go to Eclipse > expand src/main/java > expand <projectName> > delete "Library.java
    - expand src/test/java > expand <projectName> > delete LibraryTest.java
    - go to src/main/java > right click on <projectName> > new > Class
    - add a name for the Class file
    - check the option "public static void main.."
    - click finish
    - get the code for starting a new appium session from  the [Appium docs](http://appium.io/docs/en/commands/session/create/)
    - copy the code under "Java" tab 
    - go to Eclipse and paste the code under the main method in the newly created Class file
    - resolve the errors by adding the required imports:
        * click "Desired Capabilities" > click "Import..."
        * click "URL" > click "Import ... (java.net)"
        * change IOSDriver (the one on the left side) to AppiumDriver (which is the umbrella driver for all platforms)
        * click AppiumDriver > click import AppiumDriver 
        * for Android, change driver for IOSDriver (on the left) to AndroidDriver 
        * click AndroidDriver > click import AndroidDriver 

## Launch sample app on device
