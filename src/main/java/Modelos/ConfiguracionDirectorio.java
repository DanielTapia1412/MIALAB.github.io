/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/*  3:   */ public class ConfiguracionDirectorio
/*  4:   */ {
/*  5:   */   private Integer codigoDirectorio;
/*  6:   */   private String path;
/*  7:   */   /*  7:   */   
/*  8:   */   public ConfiguracionDirectorio() {}
/*  9:   */   /*  9:   */   
/* 10:   */   public ConfiguracionDirectorio(int codigoDirectorio, String path)
/* 11:   */   {
/* 12:20 */     this.codigoDirectorio = Integer.valueOf(codigoDirectorio);
/* 13:21 */     this.path = path;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public Integer getCodigoDirectorio()
/* 17:   */   {
/* 18:28 */     return this.codigoDirectorio;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String getPath()
/* 22:   */   {
/* 23:35 */     return this.path;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCodigoDirectorio(Integer codigoDirectorio)
/* 27:   */   {
/* 28:39 */     this.codigoDirectorio = codigoDirectorio;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setPath(String path)
/* 32:   */   {
/* 33:43 */     this.path = path;
/* 34:   */   }
/* 35:   */ }
