package com.huirongxing.serverless.ci;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.json.simple.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:wings.wang@hrx.ai">Wings Wang</a>
 * @version  $Revision$, 03/08/2018
 */
public class Sample {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final int STATUS_OK = 200;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   inputStream   DOCUMENT ME!
   * @param   outputStream  DOCUMENT ME!
   * @param   context       DOCUMENT ME!
   *
   * @throws  IOException  DOCUMENT ME!
   */
  public void greeting(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
    JSONObject responseJson = new JSONObject();


    String greeting = "Hello world!";


    JSONObject responseBody = new JSONObject();

    responseBody.put("message", greeting);

    JSONObject headerJson = new JSONObject();
    headerJson.put("x-custom-header", "my custom header value");

    responseJson.put("statusCode", STATUS_OK);
    responseJson.put("headers", headerJson);
    responseJson.put("body", responseBody.toString());


    OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
    writer.write(responseJson.toJSONString());
    writer.close();
  }
} // end class Sample
