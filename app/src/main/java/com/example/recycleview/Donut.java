package com.example.recycleview;

public class Donut {
    private int img;
    private String ten,gia,mota;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Donut(int img, String ten, String gia, String mota) {
        this.img = img;
        this.ten = ten;
        this.gia = gia;
        this.mota = mota;
    }
}
