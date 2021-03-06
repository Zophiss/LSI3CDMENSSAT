//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.04 at 10:12:58 PM CET 
//


package fr.enssat.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}qualificationName"/>
 *         &lt;element ref="{}qualificationDescription"/>
 *         &lt;element ref="{}credits"/>
 *         &lt;element ref="{}degree"/>
 *         &lt;element ref="{}profession"/>
 *         &lt;element ref="{}studyQualification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qualificationName",
    "qualificationDescription",
    "credits",
    "degree",
    "profession",
    "studyQualification"
})
@XmlRootElement(name = "qualification")
@Entity(name = "Qualification")
@Table(name = "QUALIFICATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Qualification
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected Text qualificationName;
    @XmlElement(required = true)
    protected QualificationDescription qualificationDescription;
    @XmlElement(required = true)
    protected Credits credits;
    @XmlElement(required = true)
    protected Degree degree;
    @XmlElement(required = true)
    protected Profession profession;
    @XmlElement(required = true)
    protected StudyQualification studyQualification;
    @XmlTransient
    protected Long hjid;

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    @ManyToOne(targetEntity = Text.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUALIFICATIONNAME_QUALIFICAT_0")
    public Text getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setQualificationName(Text value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the qualificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationDescription }
     *     
     */
    @ManyToOne(targetEntity = QualificationDescription.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUALIFICATIONDESCRIPTION_QUA_0")
    public QualificationDescription getQualificationDescription() {
        return qualificationDescription;
    }

    /**
     * Sets the value of the qualificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationDescription }
     *     
     */
    public void setQualificationDescription(QualificationDescription value) {
        this.qualificationDescription = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * @return
     *     possible object is
     *     {@link Credits }
     *     
     */
    @ManyToOne(targetEntity = Credits.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CREDITS_QUALIFICATION_HJID")
    public Credits getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credits }
     *     
     */
    public void setCredits(Credits value) {
        this.credits = value;
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link Degree }
     *     
     */
    @ManyToOne(targetEntity = Degree.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DEGREE_QUALIFICATION_HJID")
    public Degree getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Degree }
     *     
     */
    public void setDegree(Degree value) {
        this.degree = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link Profession }
     *     
     */
    @ManyToOne(targetEntity = Profession.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROFESSION_QUALIFICATION_HJID")
    public Profession getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profession }
     *     
     */
    public void setProfession(Profession value) {
        this.profession = value;
    }

    /**
     * Gets the value of the studyQualification property.
     * 
     * @return
     *     possible object is
     *     {@link StudyQualification }
     *     
     */
    @ManyToOne(targetEntity = StudyQualification.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STUDYQUALIFICATION_QUALIFICA_0")
    public StudyQualification getStudyQualification() {
        return studyQualification;
    }

    /**
     * Sets the value of the studyQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyQualification }
     *     
     */
    public void setStudyQualification(StudyQualification value) {
        this.studyQualification = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Qualification)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Qualification that = ((Qualification) object);
        {
            Text lhsQualificationName;
            lhsQualificationName = this.getQualificationName();
            Text rhsQualificationName;
            rhsQualificationName = that.getQualificationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualificationName", lhsQualificationName), LocatorUtils.property(thatLocator, "qualificationName", rhsQualificationName), lhsQualificationName, rhsQualificationName)) {
                return false;
            }
        }
        {
            QualificationDescription lhsQualificationDescription;
            lhsQualificationDescription = this.getQualificationDescription();
            QualificationDescription rhsQualificationDescription;
            rhsQualificationDescription = that.getQualificationDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualificationDescription", lhsQualificationDescription), LocatorUtils.property(thatLocator, "qualificationDescription", rhsQualificationDescription), lhsQualificationDescription, rhsQualificationDescription)) {
                return false;
            }
        }
        {
            Credits lhsCredits;
            lhsCredits = this.getCredits();
            Credits rhsCredits;
            rhsCredits = that.getCredits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "credits", lhsCredits), LocatorUtils.property(thatLocator, "credits", rhsCredits), lhsCredits, rhsCredits)) {
                return false;
            }
        }
        {
            Degree lhsDegree;
            lhsDegree = this.getDegree();
            Degree rhsDegree;
            rhsDegree = that.getDegree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "degree", lhsDegree), LocatorUtils.property(thatLocator, "degree", rhsDegree), lhsDegree, rhsDegree)) {
                return false;
            }
        }
        {
            Profession lhsProfession;
            lhsProfession = this.getProfession();
            Profession rhsProfession;
            rhsProfession = that.getProfession();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profession", lhsProfession), LocatorUtils.property(thatLocator, "profession", rhsProfession), lhsProfession, rhsProfession)) {
                return false;
            }
        }
        {
            StudyQualification lhsStudyQualification;
            lhsStudyQualification = this.getStudyQualification();
            StudyQualification rhsStudyQualification;
            rhsStudyQualification = that.getStudyQualification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "studyQualification", lhsStudyQualification), LocatorUtils.property(thatLocator, "studyQualification", rhsStudyQualification), lhsStudyQualification, rhsStudyQualification)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            Text theQualificationName;
            theQualificationName = this.getQualificationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualificationName", theQualificationName), currentHashCode, theQualificationName);
        }
        {
            QualificationDescription theQualificationDescription;
            theQualificationDescription = this.getQualificationDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualificationDescription", theQualificationDescription), currentHashCode, theQualificationDescription);
        }
        {
            Credits theCredits;
            theCredits = this.getCredits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "credits", theCredits), currentHashCode, theCredits);
        }
        {
            Degree theDegree;
            theDegree = this.getDegree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "degree", theDegree), currentHashCode, theDegree);
        }
        {
            Profession theProfession;
            theProfession = this.getProfession();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profession", theProfession), currentHashCode, theProfession);
        }
        {
            StudyQualification theStudyQualification;
            theStudyQualification = this.getStudyQualification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "studyQualification", theStudyQualification), currentHashCode, theStudyQualification);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
