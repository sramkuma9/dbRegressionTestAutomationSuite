package bni.regression.libraries.common;

import java.io.*;
import java.util.Properties;

public class ReadWritePropertyFile {

    public String loadAndReadPropertyFile(String propParameter ){
        Properties prop = new Properties();
        InputStream input = null;
        String propVal = null;

        try {
            // load a properties file
            input = new FileInputStream(getClass().getClassLoader().getResource("properties/config.properties").getPath());
            prop.load(input);

            // get the property value and print it out
            propVal = prop.getProperty(propParameter);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return propVal;
    }

    public void writePropertyFile(String propParameter ){
        InputStream input = null;
        try {
            // load a properties file
            input = new FileInputStream(getClass().getClassLoader().getResource("properties/config.properties").getPath());
            OutputStream output = new FileOutputStream(getClass().getClassLoader().getResource("properties/config.properties").getPath());
            Properties prop = new Properties();
            prop.load(input);
            // get the property value and print it out
            prop.setProperty("dateTime", "test");
            prop.store(output,null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            }
        }