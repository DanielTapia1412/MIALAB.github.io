/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Reportes;

/*  3:   */ public class InformacionAdicional
/*  4:   */ {
/*  5:   */   private String valor;
/*  6:   */   private String nombre;
/*  7:   */   
/*  8:   */   public InformacionAdicional(String valor, String nombre)
/*  9:   */   {
/* 10:16 */     this.valor = valor;
/* 11:17 */     this.nombre = nombre;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public InformacionAdicional() {}
/* 15:   */   
/* 16:   */   public String getValor()
/* 17:   */   {
/* 18:29 */     return this.valor;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setValor(String valor)
/* 22:   */   {
/* 23:36 */     this.valor = valor;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getNombre()
/* 27:   */   {
/* 28:43 */     return this.nombre;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setNombre(String nombre)
/* 32:   */   {
/* 33:50 */     this.nombre = nombre;
/* 34:   */   }
/* 35:   */ }
