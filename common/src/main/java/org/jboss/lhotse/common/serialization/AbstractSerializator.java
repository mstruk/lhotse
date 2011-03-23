package org.jboss.lhotse.common.serialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Abstract serializator.
 *
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
public abstract class AbstractSerializator implements Serializator
{
   protected AbstractSerializator()
   {
   }

   /**
    * By default we return true.
    *
    * @param clazz the class
    * @return true
    */
   public boolean isValid(Class<?> clazz)
   {
      return true;
   }

   public byte[] serialize(Object instance) throws IOException
   {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      serialize(instance, baos);
      return baos.toByteArray();
   }
}