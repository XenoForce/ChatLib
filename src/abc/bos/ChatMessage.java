package abc.bos;

import java.io.Serializable;


public class ChatMessage /* implements Serializable */ {
  
  //-------------------------------------------------------------------------//
  //  Attributes                                                             //
  //-------------------------------------------------------------------------//
  public java.util.Date  timeStamp   ;
  public String          id          ;
  public String          sender      ;
  public String          destination ;
  public String          body        ;
  public boolean         shown       ;
  
  
  //-------------------------------------------------------------------------//
  //  toString()                                                             //
  //-------------------------------------------------------------------------//
  @Override
  public String toString() {
    
    String s = "\r\n"
      + "\r\n"
      + "timeStamp"   + " = " + timeStamp   + "\r\n"
      + "id"          + " = " + id          + "\r\n"
      + "sender"      + " = " + sender      + "\r\n"
      + "destination" + " = " + destination + "\r\n"
      + "body"        + " = " + body        + "\r\n"
      + "shown"       + " = " + shown       + "\r\n";
    
    return s;
  } //toString()
  
  
} //class
