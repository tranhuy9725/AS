package b2;

public abstract class PhuongTienGiaoThong {
    private String hsx;
    private String cachDiChuyen;

    public PhuongTienGiaoThong(String hsx, String cachDiChuyen) {
        this.hsx = hsx;
        this.cachDiChuyen = cachDiChuyen;
    }

    public String getHsx() {
        return hsx;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    public String getCachDiChuyen() {
        return cachDiChuyen;
    }

    public void setCachDiChuyen(String cachDiChuyen) {
        this.cachDiChuyen = cachDiChuyen;
    }
}
