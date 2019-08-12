package com.chau.yoyoshop.Model.ObjectClass;

public class HoaDon  {


    private int MAHD;

    private String NGAYMUA;

    private String NGAYGIAO;

    private String 	TRANGTHAI;

    private String TENNGUOINHAN;

    private String SODT;

    private String DIACHI;


    private String HINHTHUCTHANHTOAN;

    private double TONGTIEN;

    private int USERID;

    private String ANH;

    public HoaDon() {
    }

    public HoaDon(int mAHD, String nGAYMUA, String nGAYGIAO, String tRANGTHAI, String tENNGUOINHAN, String sODT,
                  String dIACHI, String hINHTHUCTHANHTOAN, double tONGTIEN, Integer uSERID) {
        super();
        MAHD = mAHD;
        NGAYMUA = nGAYMUA;
        NGAYGIAO = nGAYGIAO;
        TRANGTHAI = tRANGTHAI;
        TENNGUOINHAN = tENNGUOINHAN;
        SODT = sODT;
        DIACHI = dIACHI;
        HINHTHUCTHANHTOAN = hINHTHUCTHANHTOAN;
        TONGTIEN = tONGTIEN;
        USERID = uSERID;
    }

    public HoaDon(String tENNGUOINHAN, String sODT, String dIACHI, String hINHTHUCTHANHTOAN, double tONGTIEN) {
        super();
        TENNGUOINHAN = tENNGUOINHAN;
        SODT = sODT;
        DIACHI = dIACHI;
        HINHTHUCTHANHTOAN = hINHTHUCTHANHTOAN;
        TONGTIEN = tONGTIEN;
    }

    public HoaDon(String tENNGUOINHAN, String sODT, String dIACHI) {
        super();
        TENNGUOINHAN = tENNGUOINHAN;
        SODT = sODT;
        DIACHI = dIACHI;
    }


    public String getANH() {
        return ANH;
    }

    public void setANH(String ANH) {
        this.ANH = ANH;
    }

    public int getMAHD() {
        return MAHD;
    }

    public void setMAHD(int mAHD) {
        MAHD = mAHD;
    }

    public String getNGAYMUA() {
        return NGAYMUA;
    }

    public void setNGAYMUA(String nGAYMUA) {
        NGAYMUA = nGAYMUA;
    }

    public String getNGAYGIAO() {
        return NGAYGIAO;
    }

    public void setNGAYGIAO(String nGAYGIAO) {
        NGAYGIAO = nGAYGIAO;
    }

    public String getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(String tRANGTHAI) {
        TRANGTHAI = tRANGTHAI;
    }

    public String getTENNGUOINHAN() {
        return TENNGUOINHAN;
    }

    public void setTENNGUOINHAN(String tENNGUOINHAN) {
        TENNGUOINHAN = tENNGUOINHAN;
    }

    public String getSODT() {
        return SODT;
    }

    public void setSODT(String sODT) {
        SODT = sODT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String dIACHI) {
        DIACHI = dIACHI;
    }

    public String getHINHTHUCTHANHTOAN() {
        return HINHTHUCTHANHTOAN;
    }

    public void setHINHTHUCTHANHTOAN(String hINHTHUCTHANHTOAN) {
        HINHTHUCTHANHTOAN = hINHTHUCTHANHTOAN;
    }

    public double getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(double tONGTIEN) {
        TONGTIEN = tONGTIEN;
    }

    public Integer getUSERID() {
        return USERID;
    }

    public void setUSERID(Integer uSERID) {
        USERID = uSERID;
    }

}
