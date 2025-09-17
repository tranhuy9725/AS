package b2;

public class Oto extends PhuongTienGiaoThong implements PhuongTien {

    public Oto(String hsx, String cachDiChuyen) {
        super(hsx, cachDiChuyen);
    }

    @Override
    public void napnhienlieu() {
        System.out.println("Nap nhien lieu xang");
    }

}
