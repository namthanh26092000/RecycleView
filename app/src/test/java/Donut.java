public class Donut {
    private int img;
    private String tenDonut;
    private String gia;
    private String mota1;
    private String mota2;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTenDonut() {
        return tenDonut;
    }

    public void setTenDonut(String tenDonut) {
        this.tenDonut = tenDonut;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMota1() {
        return mota1;
    }

    public void setMota1(String mota1) {
        this.mota1 = mota1;
    }

    public String getMota2() {
        return mota2;
    }

    public void setMota2(String mota2) {
        this.mota2 = mota2;
    }

    public Donut(int img, String tenDonut, String gia, String mota1, String mota2) {
        this.img = img;
        this.tenDonut = tenDonut;
        this.gia = gia;
        this.mota1 = mota1;
        this.mota2 = mota2;
    }
}
