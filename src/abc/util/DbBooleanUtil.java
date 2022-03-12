package abc.util;


public class DbBooleanUtil {
  
  //-------------------------------------------------------------------------//
  //  formatBoolean()                                                        //
  //-------------------------------------------------------------------------//
  public static String formatBoolean( boolean  theBool ) {
    
    String retVal = "false";
    
    if (theBool) {
      retVal = "true";
    } //if
    
    return retVal;
  } //formatBoolean()
  
  
} //class
