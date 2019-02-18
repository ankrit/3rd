set projectLocation=C:\Users\vinda\git\shashank\VDOhire_
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\job.xml
pause