package br.com.icm.amazinlog.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class SerializeUtils {

    /** Read the object from Base64 string. */
    @SuppressWarnings("unchecked")
    public static <T> T fromString( String s ) throws IOException ,
                ClassNotFoundException {
        return (T) fromStringToObject(s);
    }
    

    public static Object fromStringToObject( String s ) throws IOException ,
                                                        ClassNotFoundException {
        try {
            
         byte [] data = Base64.getDecoder().decode( s );
         ObjectInputStream ois = new ObjectInputStream( 
                                         new ByteArrayInputStream(  data ) );
         Object o  = ois.readObject();
         ois.close();
         return o;
        }catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

     /** Write the object to a Base64 string. */
    public static String toString( Serializable o ) throws IOException {
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream( baos );
         oos.writeObject( o );
         oos.close();
         return Base64.getEncoder().encodeToString(baos.toByteArray()); 
     }
}
