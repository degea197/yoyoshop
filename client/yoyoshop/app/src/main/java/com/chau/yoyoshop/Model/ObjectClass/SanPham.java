package com.chau.yoyoshop.Model.ObjectClass;

public class SanPham {


    private int MASP;

    private String TENSP;

    private  Double GIA;

    private String ANHLON;

    private  String ANHNHO;

    private   String THONGTIN;

    private   int SOLUONG;

    private   Integer MALOAISP;

    private   Integer MATHUONGHIEU;

    private  Integer MANV;

    private    int LUOTMUA;

    public SanPham(int mASP, String tENSP, Double gIA, String aNHLON, String aNHNHO, String tHONGTIN, int sOLUONG,
                   int mALOAISP, Integer mATHUONGHIEU, Integer mANV, int lUOTMUA) {
        super();
        MASP = mASP;
        TENSP = tENSP;
        GIA = gIA;
        ANHLON = aNHLON;
        ANHNHO = aNHNHO;
        THONGTIN = tHONGTIN;
        SOLUONG = sOLUONG;
        MALOAISP = mALOAISP;
        MATHUONGHIEU = mATHUONGHIEU;
        MANV = mANV;
        LUOTMUA = lUOTMUA;
    }

    public SanPham(String tENSP, Double gIA, String aNHLON, String aNHNHO, String tHONGTIN, int sOLUONG, int mALOAISP,
                   Integer mATHUONGHIEU, Integer mANV, int lUOTMUA) {
        super();
        TENSP = tENSP;
        GIA = gIA;
        ANHLON = aNHLON;
        ANHNHO = aNHNHO;
        THONGTIN = tHONGTIN;
        SOLUONG = sOLUONG;
        MALOAISP = mALOAISP;
        MATHUONGHIEU = mATHUONGHIEU;
        MANV = mANV;
        LUOTMUA = lUOTMUA;
    }

    public SanPham() {
        super();
    }

    public int getMASP() {
        return MASP;
    }

    public void setMASP(int mASP) {
        MASP = mASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String tENSP) {
        TENSP = tENSP;
    }

    public Double getGIA() {
        return GIA;
    }

    public void setGIA(Double gIA) {
        GIA = gIA;
    }

    public String getANHLON() {
        return ANHLON;
    }

    public void setANHLON(String aNHLON) {
        ANHLON = aNHLON;
    }

    public String getANHNHO() {
        return ANHNHO;
    }

    public void setANHNHO(String aNHNHO) {
        ANHNHO = aNHNHO;
    }

    public String getTHONGTIN() {
        return THONGTIN;
    }

    public void setTHONGTIN(String tHONGTIN) {
        THONGTIN = tHONGTIN;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int sOLUONG) {
        SOLUONG = sOLUONG;
    }

    public int getMALOAISP() {
        return MALOAISP;
    }

    public void setMALOAISP(int mALOAISP) {
        MALOAISP = mALOAISP;
    }

    public Integer getMATHUONGHIEU() {
        return MATHUONGHIEU;
    }

    public void setMATHUONGHIEU(Integer mATHUONGHIEU) {
        MATHUONGHIEU = mATHUONGHIEU;
    }

    public Integer getMANV() {
        return MANV;
    }

    public void setMANV(Integer mANV) {
        MANV = mANV;
    }

    public int getLUOTMUA() {
        return LUOTMUA;
    }

    public void setLUOTMUA(int lUOTMUA) {
        LUOTMUA = lUOTMUA;
    }

}
