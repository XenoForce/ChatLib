package abc.util;


public class DbStringUtil {
  
  //-------------------------------------------------------------------------//
  //  formatString()                                                         //
  //-------------------------------------------------------------------------//
  public static String formatString( String  str ) {
    
    String retVal = "null";
    
    if (null != str) {
      String sTmp = str.replaceAll("'","''");
      retVal = "'" + sTmp + "'";
    } //if
    
    return retVal;
  } //formatString()
  
  
} //class
