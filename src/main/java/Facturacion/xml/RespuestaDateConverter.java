/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion.xml;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RespuestaDateConverter implements Converter {
  public static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
  
  public boolean canConvert(Class clazz) {
    return clazz.equals(XMLGregorianCalendarImpl.class);
  }
  
  public void marshal(Object o, HierarchicalStreamWriter writer, MarshallingContext mc) {
    XMLGregorianCalendarImpl i = (XMLGregorianCalendarImpl)o;
    writer.setValue(dateTimeFormat.format(i.toGregorianCalendar().getTime()));
  }
  
  public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext uc) {
    Date date = null;
    try {
      date = dateTimeFormat.parse(reader.getValue());
    } catch (ParseException ex) {
      Logger.getLogger(RespuestaDateConverter.class.getName()).log(Level.SEVERE, (String)null, ex);
    } 
    GregorianCalendar cal = new GregorianCalendar();
    cal.setTime(date);
    XMLGregorianCalendarImpl item = new XMLGregorianCalendarImpl(cal);
    return item;
  }
}