/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.NotaCredito;

/*  3:   */ import javax.xml.bind.annotation.XmlAccessType;
/*  4:   */ import javax.xml.bind.annotation.XmlAccessorType;
/*  5:   */ import javax.xml.bind.annotation.XmlElement;
/*  6:   */ import javax.xml.bind.annotation.XmlType;
/*  7:   */ 
/*  8:   */ @XmlAccessorType(XmlAccessType.FIELD)
/*  9:   */ @XmlType(name="detalle", propOrder={"motivoModificacion"})
/* 10:   */ public class Detalle
/* 11:   */ {
/* 12:   */   @XmlElement(required=true)
/* 13:   */   protected String motivoModificacion;
/* 14:   */   
/* 15:   */   public String getMotivoModificacion()
/* 16:   */   {
/* 17:56 */     return this.motivoModificacion;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setMotivoModificacion(String value)
/* 21:   */   {
/* 22:68 */     this.motivoModificacion = value;
/* 23:   */   }
/* 24:   */ }
