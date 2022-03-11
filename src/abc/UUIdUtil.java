package abc;

import java.util.UUID;


public class UUIdUtil {
  
  //-------------------------------------------------------------------------//
  //  makeNewUUID()                                                          //
  //-------------------------------------------------------------------------//
  public static String makeNewUUID() {
    
    UUID uuid = UUID.randomUUID();
    
    String retVal = uuid.toString();
    return retVal;
  } //makeNewUUID()
  
  
} //class
