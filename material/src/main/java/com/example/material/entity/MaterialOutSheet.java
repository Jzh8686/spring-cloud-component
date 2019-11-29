package com.example.material.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MaterialOutSheet {
    String hosnum;
    String nodeCode;
    String outSheetNo;
    String deptCode;
    String deptName;
    String outType;
    int rSheetNum;
    String rSheetSdes;
    String unitScode;
    String unitSName;
    String sheetMan;
    String sheetMName;
    Date sheetDate;
    String checkMan;
    String checkMName;
    Date checkDate;
    String comments;
    String outSheetId;
    String sellPerson;
    String handlePerSon;
    String hhosnum;
    String hNodeCode;
    String hHosName;
    String storeName;
    String invoiceNo;
}
