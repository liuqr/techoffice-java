//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.10.27 於 04:40:07 PM CST 
//


package com.techoffice.mybatis2.sqlmap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "flushOnExecute")
public class FlushOnExecute {

    @XmlAttribute(name = "statement", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String statement;

    /**
     * 取得 statement 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatement() {
        return statement;
    }

    /**
     * 設定 statement 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatement(String value) {
        this.statement = value;
    }

}
