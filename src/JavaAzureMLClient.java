import java.net.*;
import java.io.*;
import java.util.*;

public class AzureMLClient 
{

      private endPointURL; //Azure ML Endpoint
      private key; //API KEY


      public AzureMLClient(String endPointURL,String key)
      {
        this.endPointURL= endPointURL;
        this.key= key;
      }
      /*
       Takes an Azure ML Request Body then Returns the Response String Which Contains Scored Lables etc
      */
      public static String requestResponse( String requestBody ) throws Exception
      {
        URL u = new URL(this.endPointURL);
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();

        conn.setRequestProperty("Authorization","Bearer "+ this.key);
        conn.setRequestProperty("Content-Type","application/json");
        conn.setRequestMethod("POST");
        
        String body= new String(requestBody);
        
        conn.setDoOutput(true);
        OutputStreamWriter wr=new OutputStreamWriter(conn.getOutputStream());

        wr.write(body);
        wr.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        
        String decodedString;
        String responseString="";    

        while ((decodedString = in.readLine()) != null) 
    	  {
            response+=decodedString;
        }
    	  return responseString;
     }

  }
