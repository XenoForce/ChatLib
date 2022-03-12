package abc.util;

import java.text.SimpleDateFormat;


public class MessageDateUtil {
  
  //-------------------------------------------------------------------------//
  //  Attributes                                                             //
  //-------------------------------------------------------------------------//
  private static SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
  
  
  //-------------------------------------------------------------------------//
  //  formatTimeStamp()                                                      //
  //-------------------------------------------------------------------------//
  public static String formatTimeStamp( java.util.Date  timeStamp ) {
    
    String retVal = "";
    
    if (null != timeStamp) {
      retVal = dtFmt.format( timeStamp );
    } //if
    
    return retVal;
  } //formatTimeStamp()
  
  
} //class
