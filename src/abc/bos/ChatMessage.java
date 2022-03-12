package abc.bos;

import java.io.Serializable;


public class ChatMessage implements Serializable {
  
  //-------------------------------------------------------------------------//
  //  Attributes                                                             //
  //-------------------------------------------------------------------------//
  public java.util.Date  timeStamp ;
  public String          id        ;
  public String          from      ;
  public String          to        ;
  public String          body      ;
  public boolean         shown     ;
  
  
} //class
