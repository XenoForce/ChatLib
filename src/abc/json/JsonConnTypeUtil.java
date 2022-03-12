package abc.json;

import abc.netio.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class JsonConnTypeUtil {
  
  //-------------------------------------------------------------------------//
  //  Attributes                                                             //
  //-------------------------------------------------------------------------//
  private static ObjectMapper  mapper ;
  
  
  //-------------------------------------------------------------------------//
  //  requestToJson()                                                        //
  //-------------------------------------------------------------------------//
  public static String requestToJson( ConnTypeRequest  req ) throws Exception {
    
    ensure_Mapper_Exists();
    
    String retVal = mapper.writeValueAsString( req );
    
    return retVal;
  } //requestToJson()
  
  
  //-------------------------------------------------------------------------//
  //  jsonToRequest()                                                        //
  //-------------------------------------------------------------------------//
  public static ConnTypeRequest jsonToRequest( String  json ) throws Exception {
    
    ensure_Mapper_Exists();
    
    ConnTypeRequest retVal = mapper.readValue( json, ConnTypeRequest.class );
    
    return retVal;
  } //jsonToRequest()
  
  
  //-------------------------------------------------------------------------//
  //  responseToJson()                                                       //
  //-------------------------------------------------------------------------//
  public static String responseToJson( ConnTypeResponse  resp ) throws Exception {
    
    ensure_Mapper_Exists();
    
    String retVal = mapper.writeValueAsString( resp );
    
    return retVal;
  } //responseToJson()
  
  
  //-------------------------------------------------------------------------//
  //  jsonToResponse()                                                       //
  //-------------------------------------------------------------------------//
  public static ConnTypeResponse jsonToResponse( String  json ) throws Exception {
    
    ensure_Mapper_Exists();
    
    ConnTypeResponse retVal = mapper.readValue( json, ConnTypeResponse.class );
    
    return retVal;
  } //jsonToResponse()
  
  
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
