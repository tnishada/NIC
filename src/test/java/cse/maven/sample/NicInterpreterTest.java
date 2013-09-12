/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;
import junit.framework.TestCase;

/**
 *
 * @author VIDURA
 */
public class NicInterpreterTest extends TestCase{

    
    protected void setUp() throws Exception {
        super.setUp();
        
    }

    protected void tearDown() throws Exception {
        super.tearDown();
              
        
    }

    public void testGetYear()throws Exception {  //Test of getYear method
        System.out.println("getYear");
        NicInterpreter instance = new NicInterpreter("912080102V");
        int expResult = 1991;
        int result = instance.getYear();
        assertEquals(expResult, result);

    }
     
    public void testGetMonth()throws Exception {   // Test of getMonth method
        System.out.println("getMonth");
        NicInterpreter instance = new NicInterpreter("912080102V");
        int expResult = 3;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    public void testGetDate()throws Exception {      //Test of getDate method
        System.out.println("getDate");
        NicInterpreter instance = new NicInterpreter("912080102V");;
        int expResult = 15;
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    public void testGetGender()throws Exception {      //Test of getGender method
        System.out.println("getGender");
        NicInterpreter instance = new NicInterpreter("912080102V");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    public void testIsVoter()throws Exception {        //Test of isVoter method
        System.out.println("isVoter");
        NicInterpreter instance = new NicInterpreter("912080102V");
        String expResult = "True";
        String result = instance.isVoter();
        assertEquals(expResult, result);
    }
   
   
      
    
}
