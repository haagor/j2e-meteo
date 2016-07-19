
package stubs.affichage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour afficheWindResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="afficheWindResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affiche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afficheWindResponse", propOrder = {
    "affiche"
})
public class AfficheWindResponse {

    protected String affiche;

    /**
     * Obtient la valeur de la propriété affiche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiche() {
        return affiche;
    }

    /**
     * Définit la valeur de la propriété affiche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiche(String value) {
        this.affiche = value;
    }

}
