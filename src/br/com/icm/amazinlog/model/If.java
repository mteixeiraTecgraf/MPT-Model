package br.com.icm.amazinlog.model;

import java.util.function.Consumer;

public class If {

	static <T> void On(T t,Consumer<T> a) {
	    a.accept(t);
	}
	public static void IsTag(Object o, Consumer<Tag> a) {
	    if(o instanceof Tag)
	    {	        
	    	On((Tag)o,a);
	    }
    }
	public static void IsStart(Object o, Consumer<Start> a) {
         if(o instanceof Start)
         {           
             On((Start)o,a);
         }
     }
	public static void IsWatch(Object o, Consumer<Watch> a) {
         if(o instanceof Watch)
         {           
             On((Watch)o,a);
         }
     }
	public static void IsTransfer(Object o, Consumer<Transfer> a) {
        if(o instanceof Transfer)
        {           
            On((Transfer)o,a);
        }
    }

}
