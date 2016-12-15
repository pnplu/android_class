package com.plupasit.wksp02_13560220;

import android.os.StrictMode;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by pnplu on 10/17/2016 AD.
 */

public class ServerConnector
{
    public final static String http = "http://";
    public final static String ip = "172.24.0.39";
    public final static String dir = "220";
    public final static String seturl = http+ip+"/"+dir;

    public ServerConnector()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public String connect(String page, boolean response) {
        //1. Create variable StringBuilder for response streaming data
        StringBuilder result = new StringBuilder();

        //2. Create set url+page http://xxx.xxx.xxx.xxx/xxx/index.php
        String url = seturl+"/"+page;

        //3. Create variable for URL Data

        try
        {
            URL urlcon = new URL(url);


            //4. Create variable for HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) urlcon.openConnection();

            //5. Setting HttpUrlConnect
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(5000);
            connection.setRequestProperty("charset","utf-8");

            //6. Create DataOutputStream
            DataOutputStream outstream = new DataOutputStream(connection.getOutputStream());



        //7. Condition of response
        if(response == true)
        {
            //7.1 Create variable of String for line
            String line;

            //7.2 Create variable of BufferReader
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));

            //7.3 Create Loop for read
            while ((line = br.readLine()) != null)
            {
                result.append(line);
            }
        }
    } catch (MalformedURLException e)
    {
        e.printStackTrace();
    } catch (IOException e)
    {
        e.printStackTrace();
    }
        //8. return data  from String Bulider
        return result.toString();
    }
}
