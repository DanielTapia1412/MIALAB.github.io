/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion.Util;

/*  3:   */ public enum TipoImpuestoIvaEnum
/*  4:   */ {
/*  5:10 */   IVA_VENTA_0("0"),  IVA_VENTA_12("2"),  IVA_NO_OBJETO("6"),  IVA_EXCENTO("7");
/*  6:   */   
/*  7:   */   private String code;
/*  8:   */   
/*  9:   */   private TipoImpuestoIvaEnum(String code)
/* 10:   */   {
/* 11:15 */     this.code = code;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public String getCode()
/* 15:   */   {
/* 16:24 */     return this.code;
/* 17:   */   }
/* 18:   */ }
