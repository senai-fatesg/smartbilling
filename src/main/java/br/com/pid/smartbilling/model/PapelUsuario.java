package br.com.pid.smartbilling.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PapelUsuario implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id; 
 
    @Column(name="TYPE", length=15, unique=true, nullable=false)
    private String type = EnumPapelUsuario.USUARIO.getDescricao();
     
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof PapelUsuario))
            return false;
        PapelUsuario other = (PapelUsuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "UserProfile [id=" + id + ", type=" + type + "]";
    }
}
 