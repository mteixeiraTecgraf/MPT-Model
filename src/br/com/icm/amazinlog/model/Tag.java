package br.com.icm.amazinlog.model;

import java.io.Serializable;
import java.util.Date;

public class Tag implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String name;
    private Date date;
    public Tag()
    {
    }
    public Tag(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //JSONObject toJson() {
    	
    //}
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Tag)
        {
            Tag other = (Tag) obj;
            System.out.println("Equals verify "+name + " "+ (other.name));
            return name.equals(other.name);
        }
        return false;
    }
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
