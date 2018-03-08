import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.huirongxing.serverless.ci.Sample;

import static junit.framework.TestCase.assertNotNull;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:wings.wang@hrx.ai">Wings Wang</a>
 * @version  $Revision$, 03/08/2018
 */
public class DemoJunit {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   */
  @Test
  public void success() {
    OutputStream outputStream = new ByteArrayOutputStream();
    Sample       obj          = new Sample();

    try {
      obj.greeting(null, outputStream, null);
      assertNotNull(outputStream.toString());
    } catch (IOException e) {
      e.printStackTrace();
      fail("Should not throw exception");
    }

  }
} // end class DemoJunit
