package edu.msudenver.cs.jdnss;

import java.util.Properties;
import java.io.InputStream;

// https://maven.apache.org/plugins/maven-resources-plugin/examples/filter.html
// http://stackoverflow.com/questions/3104617/what-is-the-path-to-resource-files-in-a-maven-project

public class Version
{
    public String getVersion()
    {
        try
        {
            Properties properties = new Properties();
            InputStream in = 
                getClass().getResourceAsStream("/version.properties");

            properties.load(in);
            in.close();
            return properties.getProperty("version");
        }
        catch (java.io.FileNotFoundException FNFE)
        {
            return "unknown";
        }
        catch (java.io.IOException IOE)
        {
            return "unknown";
        }
    }
}
