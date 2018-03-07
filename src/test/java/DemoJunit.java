import com.afrag.gradle.learning.Sample;
import org.junit.Test;


import static junit.framework.TestSuite.warning;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:wings.wang@hrx.ai">Wings Wang</a>
 * @version  $Revision$, 03/05/2018
 */
public class DemoJunit {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   */
  @Test
  public void failed() {
    System.out.println("Execute failed test case");
    warning("Not Implemente yet");
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   */
  @Test
  public void success() {
    Sample obj = new Sample();
    obj.greeting();
    System.out.println("Execute success test case");
  }

} // end class DemoJunit
