package com;

import com.google.gson.JsonObject;
import org.boon.primitive.Int;
import org.postgresql.util.PSQLException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.*;
import java.util.ArrayList;

public class getSQL {
    //    SQLCreator sqlCreator = new SQLCreator();
//    public String getSQL(){
//        for (int i = 0; i < sqlCreator.length; i++) {
//            System.out.println(sqlCreator.getAdminAddress());
//            System.out.println(sqlCreator.getX());
//            System.out.println(sqlCreator.getY());
//        }
//
//    }
//
//    ArrayList<SQLCreator> sqlCreators = new ArrayList<SQLCreator>();
//    public static void main(String[] args) throws SQLException {
//        ArrayList<Integer>sqlarray1 = new ArrayList<Integer>();
//        ArrayList<Double>sqlarray2 = new ArrayList<Double>();
//        ArrayList<Double>sqlarray3 = new ArrayList<Double>();
//        Connection conn = null;
//        Statement st1 = null;
//        Statement st2 = null;
//        Statement st3 = null;
//        ResultSet rs1 = null;
//        ResultSet rs2 = null;
//        ResultSet rs3 = null;
//        PreparedStatement pstmt = null;
//
//
//        String url = "jdbc:postgresql://localhost/wfis47210a";
//        String user = "postgres";
//        String password = "root";
//        String sql = "SELECT AdminAddress,\n" +
//                "       ROUND(CAST(ST_X(ST_Transform(ST_GeometryN(geom, 1), 4326)) AS numeric), 6) AS \"x\",\n" +
//                "       ROUND(CAST(ST_Y(ST_Transform(ST_GeometryN(geom, 1), 4326)) AS numeric), 6) AS \"y\"\n" +
//                "from viw_wtt_wutl_ht;";
//
//
//        try {
//
//            conn = DriverManager.getConnection(url, user, password);
////            pstmt = conn.prepareStatement();
//            st1 = conn.createStatement();
//
//            // st3 = conn.createStatement();
//            rs1 = st1.executeQuery(sql);
//            while (rs1.next()) {
//                sqlarray1.add(rs1.getInt("AdminAddress"));
//                sqlarray2.add(rs1.getDouble("x"));
//                sqlarray3.add(rs1.getDouble("y"));
//
//            }
//            for (int i = 0; i < sqlarray1.size(); i++) {
//                int AdminAddress = sqlarray1.get(i);
//                double x = sqlarray2.get(i);
//                double y = sqlarray3.get(i);
//                System.out.println(AdminAddress);
//                System.out.println(x);
//                System.out.println(y);
//
//            }
//
//
//        } catch (PSQLException e) {
//            System.out.println(e);
//            e.printStackTrace();
//
//        } finally {
//            try {
//                conn.close();
//                st1.close();
//st2.close();
//st3.close();
//rs2.close();
//rs3.close();

//
//            } catch (PSQLException sqlEX) {
//                System.out.println(sqlEX);
//                sqlEX.printStackTrace();
//            } catch (SQLException e) {
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static ArrayList<String> getBcode() throws MalformedURLException {
//        Test test = new Test();
//        ArrayList<String> bCodeArray = new ArrayList<String>();
//        for (int i = 0; i < test.getSize(); i++) {
//            bCodeArray.add(test.getBcode(test.runSome2().get(i)));
//        }return bCodeArray;
//
//    }
//
//    public static ArrayList<String> getHcode() throws MalformedURLException {
//        Test test = new Test();
//        ArrayList<String> hCodeArray = new ArrayList<String>();
//        for (int i = 0; i < test.getSize(); i++) {
//            hCodeArray.add(test.getHcode(test.runSome2().get(i)));
//
//        }return hCodeArray;
//
//    }

    public static void main(String[] args) throws MalformedURLException {
        Test test = new Test();
        test.runSome();

        }

    }

//    public String getBcode() {
//        try {
//            String encoded_query = URLEncoder.encode(addressName, "UTF-8");
//            url = new URL(urlStr + encoded_query);
//            JsonObject roadAddress = getaddress(url);
//            bCode = roadAddress.get("b_code").getAsString();
//            setbCode(bCode);
//            String bCode = getbCode();
//            System.out.println(bCode);
//
//            System.out.println("법정동코드: " + bCode + "/" + "행정동코드: " + hCode);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }return bCode;


