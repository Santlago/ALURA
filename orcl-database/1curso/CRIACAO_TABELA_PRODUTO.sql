--------------------------------------------------------
--  File created - Thursday-February-08-2024   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table AL_TB_PRODUTOS
--------------------------------------------------------

  CREATE TABLE "RM552270"."AL_TB_PRODUTOS" 
   (	"PRODUTO" VARCHAR2(20 BYTE), 
	"NOME" VARCHAR2(150 BYTE), 
	"EMBALAGEM" VARCHAR2(50 BYTE), 
	"TAMANHO" VARCHAR2(50 BYTE), 
	"SABOR" VARCHAR2(50 BYTE), 
	"PRECO_LISTA" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "TBSPC_ALUNOS" ;
