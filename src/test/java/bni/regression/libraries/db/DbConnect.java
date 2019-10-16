package bni.regression.libraries.db;

import bni.regression.libraries.common.ReadWritePropertyFile;

import java.sql.*;

public class DbConnect {

    private ReadWritePropertyFile readWritePropertyFile = new ReadWritePropertyFile();

    public Integer queryRecordCount(String sqlCountQuery) {

        Connection conn = null;
        Statement totalRowCount = null;
        Integer rowCount = null;

        try {
            Class.forName(readWritePropertyFile.loadAndReadPropertyFile("driver", "properties/config.properties"));
            System.out.println(" Connecting to MYSQL for getting rowcount in " + (readWritePropertyFile.loadAndReadPropertyFile("envName", "properties/config.properties")) + " database...");
            String url = (readWritePropertyFile.loadAndReadPropertyFile("url", "properties/config.properties"));
            String userName = (readWritePropertyFile.loadAndReadPropertyFile("userName", "properties/config.properties"));
            String password = (readWritePropertyFile.loadAndReadPropertyFile("password", "properties/config.properties"));

            // connecting to db
            conn = DriverManager.getConnection(url, userName, password);
            totalRowCount = conn.createStatement();

            // getting total rowcount
            ResultSet rs = totalRowCount.executeQuery(sqlCountQuery);
            //ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            rowCount = rs.getInt(1);
            //count[1] = rsmd.getColumnCount() - 1;

            // closing the result set.
            rs.close();

            // closing db connection
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }

    public String[][] queryAndRetrieveRecords(String sqlQuery) {
        Connection conn = null;
        Statement actualResult = null;
        String[][] sqlData = new String[50000][50];
        ResultSet actualRS = null;
        String sqlCountQuery;
        if (sqlQuery.indexOf('*') > 1) {
            sqlCountQuery = sqlQuery.replace("select *", "select count(*)");
        } else {
            sqlCountQuery = sqlQuery.replace("select", "select count(*)" + ",");
        }
        Integer recordCount = this.queryRecordCount(sqlCountQuery);

        try {
            // DB connection details
            Class.forName(readWritePropertyFile.loadAndReadPropertyFile("driver", "properties/config.properties"));
            System.out.println(" Connecting to MYSQL for getting rowcount in " + (readWritePropertyFile.loadAndReadPropertyFile("envName", "properties/config.properties")) + " database...");
            String url = (readWritePropertyFile.loadAndReadPropertyFile("url", "properties/config.properties"));
            String userName = (readWritePropertyFile.loadAndReadPropertyFile("userName", "properties/config.properties"));
            String password = (readWritePropertyFile.loadAndReadPropertyFile("password", "properties/config.properties"));

            // connecting to db
            conn = DriverManager.getConnection(url, userName, password);
            actualResult = conn.createStatement();
            actualRS = actualResult.executeQuery(sqlQuery);
            ResultSetMetaData rsmd = actualRS.getMetaData();
            Integer colCount = rsmd.getColumnCount() - 1;


            //getting the value of each record.
            for (Integer iteration = 0; iteration < recordCount; iteration++) {
                actualRS.next();
                switch (colCount) {
                    case 0:
                        sqlData[iteration][0] = actualRS.getString(1);
                        break;

                    case 1:
                        sqlData[iteration][0] = actualRS.getString(1);
                        sqlData[iteration][1] = actualRS.getString(2);
                        break;

                    case 2:
                        sqlData[iteration][0] = actualRS.getString(1);
                        sqlData[iteration][1] = actualRS.getString(2);
                        sqlData[iteration][2] = actualRS.getString(3);
                        break;

                    case 3:
                        sqlData[iteration][0] = actualRS.getString(1);
                        sqlData[iteration][1] = actualRS.getString(2);
                        sqlData[iteration][2] = actualRS.getString(3);
                        sqlData[iteration][3] = actualRS.getString(4);
                        break;

                    case 4:
                        sqlData[iteration][0] = actualRS.getString(1);
                        sqlData[iteration][1] = actualRS.getString(2);
                        sqlData[iteration][2] = actualRS.getString(3);
                        sqlData[iteration][3] = actualRS.getString(4);
                        sqlData[iteration][4] = actualRS.getString(5);
                        break;

                    case 5:
                        sqlData[iteration][0] = actualRS.getString(1);
                        sqlData[iteration][1] = actualRS.getString(2);
                        sqlData[iteration][2] = actualRS.getString(3);
                        sqlData[iteration][3] = actualRS.getString(4);
                        sqlData[iteration][4] = actualRS.getString(5);
                        sqlData[iteration][4] = actualRS.getString(6);
                        break;
                }
            }

            // closing the result set.
            actualRS.close();

            // closing db connection
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlData;
    }
}

