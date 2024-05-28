// Generated with g9.

package com.viscaya.entities;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ENFERMEDADES")
public class Enfermedades implements Serializable {

    private static final long serialVersionUID = -9100927199562950133L;

	/** Primary key. */
    protected static final String PK = "codCie10";

    @Id
    @Column(name="COD_CIE10", unique=true, nullable=false, length=20)
    private String codCie10;
    @Column(name="NOMBRE_ENFERMEDAD", nullable=false, length=500)
    private String nombreEnfermedad;

    /** Default constructor. */
    public Enfermedades() {
        super();
    }

    /**
     * Access method for codCie10.
     *
     * @return the current value of codCie10
     */
    public String getCodCie10() {
        return codCie10;
    }

    /**
     * Setter method for codCie10.
     *
     * @param aCodCie10 the new value for codCie10
     */
    public void setCodCie10(String aCodCie10) {
        codCie10 = aCodCie10;
    }

    /**
     * Access method for nombreEnfermedad.
     *
     * @return the current value of nombreEnfermedad
     */
    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    /**
     * Setter method for nombreEnfermedad.
     *
     * @param aNombreEnfermedad the new value for nombreEnfermedad
     */
    public void setNombreEnfermedad(String aNombreEnfermedad) {
        nombreEnfermedad = aNombreEnfermedad;
    }

    /**
     * Compares the key for this instance with another Enfermedades.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Enfermedades and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Enfermedades)) {
            return false;
        }
        Enfermedades that = (Enfermedades) other;
        Object myCodCie10 = this.getCodCie10();
        Object yourCodCie10 = that.getCodCie10();
        if (myCodCie10==null ? yourCodCie10!=null : !myCodCie10.equals(yourCodCie10)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Enfermedades.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Enfermedades)) return false;
        return this.equalKeys(other) && ((Enfermedades)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getCodCie10() == null) {
            i = 0;
        } else {
            i = getCodCie10().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Enfermedades |");
        sb.append(" codCie10=").append(getCodCie10());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("codCie10", getCodCie10());
        return ret;
    }

}
