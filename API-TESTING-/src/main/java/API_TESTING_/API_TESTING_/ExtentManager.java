package API_TESTING_.API_TESTING_;


import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    static ExtentReports extent;
    
    final static String filePath = "./test-output/html/Extent.html";
    
    public static synchronized  ExtentReports getReporter() 
    {
    	
    	
        if (extent == null)
        {
            extent = new ExtentReports(filePath, true);
        }
        
        return extent;
    }
}


/**Synchronization--->
 * Synchronization in Java is an important concept since Java is a multi-threaded language 
 * where multiple threads run in parallel to complete program execution.
 * In multi-threaded environment synchronization of Java object or synchronization of Java class becomes extremely important.
 * Synchronization in Java is possible by using Java keywords "synchronized" and "volatile”.
 * 
 * 
 * Why do we need Synchronization in Java?
 * 
If your code is executing in a multi-threaded environment, you need synchronization for objects, 
which are shared among multiple threads, to avoid any corruption of state or any kind of unexpected behavior.
 Synchronization in Java will only be needed if shared object is mutable. 
 if your shared object is either read-only or immutable object, then you don't need synchronization, despite running multiple threads.
  Same is true with what threads are doing with an object if all the threads are only reading value then you don't require synchronization in Java. 
  JVM guarantees that Java synchronized code will only be executed by one thread at a time. 


Read more: https://javarevisited.blogspot.com/2011/04/synchronization-in-java-synchronized.html#ixzz5TtxZc4LM
 * 
 */
/*1... for extends repost currently using this jar for version 2
 * <dependency>
     <groupId>com.relevantcodes</groupId>
        <artifactId>extentreports</artifactId>
        <version>2.41.2</version>
     </dependency>
     
   ***** for more details for version 3 
     http://extentreports.com/docs/versions/2/java/#examples
 * 
 * 2...but if u r using 3 version 
 *   <dependency>
     <groupId>com.aventstack</groupId>
      <artifactId>extentreports</artifactId>
       <version>3.1.5</version>
      </dependency>
 * 
 *  so now for version 3 , we can direcly use 
 *  //ExtentReports extent = new ExtentReports();
 *  
 ********  for more details for version 3 
 *  http://extentreports.com/docs/versions/3/java/#examples
 */



