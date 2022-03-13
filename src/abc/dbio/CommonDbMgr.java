package abc.dbio;

import abc.bos.*;
import abc.util.*;

import java.sql.*;
import java.util.*;


public class CommonDbMgr {
  
  //-------------------------------------------------------------------------//
  //  storeMessage()                                                         //
  //-------------------------------------------------------------------------//
  public static void storeMessage( ChatMessage  msg ,
                                   Connection   con ) throws Exception {
    
    String sql = "insert into ChatMessage ( "
               + " TimeStamp, "
               + " Id, "
               + " Sender, "
               + " Destination, "
               + " Body, "
               + " Shown "
               + ") values ("
               + DbDateUtil.formatTimeStamp( msg.timeStamp)   + ", "
               + DbStringUtil.formatString( msg.id )          + ", "
               + DbStringUtil.formatString( msg.sender )      + ", "
               + DbStringUtil.formatString( msg.destination ) + ", "
               + DbStringUtil.formatString( msg.body )        + ", "
               + DbBooleanUtil.formatBoolean( msg.shown )     + ")";
    
    Statement stmt = con.createStatement();
    stmt.executeUpdate( sql );
    
    stmt.close();
  } //storeMessage()
  
  
} //class
