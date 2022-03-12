package abc.util;

import abc.bos.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class JsonMessageUtil {
  
  //-------------------------------------------------------------------------//
  //  Attributes                                                             //
  //-------------------------------------------------------------------------//
  private static ObjectMapper  mapper ;
  
  
  //-------------------------------------------------------------------------//
  //  msgToJson()                                                            //
  //-------------------------------------------------------------------------//
  public static String msgToJson( ChatMessage  msg ) throws Exception {
    
    ensure_Mapper_Exists();
    
    String retVal = mapper.writeValueAsString( msg );
    
    return retVal;
  } //msgToJson()
  
  
  //-------------------------------------------------------------------------//
  //  jsonToMsg()                                                            //
  //-------------------------------------------------------------------------//
  public static ChatMessage jsonToMsg( String  json ) throws Exception {
    
    ensure_Mapper_Exists();
    
    ChatMessage retVal = mapper.readValue( json, ChatMessage.class );
    
    return retVal;
  } //jsonToMsg()
  
  
  //-------------------------------------------------------------------------//
  //  ensure_Mapper_Exists()                                                 //
  //-------------------------------------------------------------------------//
  private static void ensure_Mapper_Exists() {
    
    if (null == mapper) {
      mapper = new ObjectMapper();
      mapper.enable( SerializationFeature.INDENT_OUTPUT );
    } //if
    
  } //ensure_Mapper_Exists()
  
  
} //class
