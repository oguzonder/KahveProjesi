package kahve;

public class kahve {
    private String kahveNo;
    private String kahveAdi;
    private String kahveBoy;
    private String sutluMü;
    private String sekerliMi;

    public kahve(){

    }

    public kahve(String kahveNo, String kahveAdi) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
    }

    public kahve(String kahveNo, String kahveAdi, String kahveBoy, String sutluMü, String sekerliMi) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
        this.kahveBoy = kahveBoy;
        this.sutluMü = sutluMü;
        this.sekerliMi = sekerliMi;
    }

    @Override
    public String toString() {
        return "kahve{" +
                "kahveNo='" + kahveNo + '\'' +
                ", kahveAdi='" + kahveAdi + '\'' +
                ", kahveBoy='" + kahveBoy + '\'' +
                ", sutluMü='" + sutluMü + '\'' +
                ", sekerliMi='" + sekerliMi + '\'' +
                '}';
    }

    public String getKahveNo() {
        return kahveNo;
    }

    public void setKahveNo(String kahveNo) {
        this.kahveNo = kahveNo;
    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public String getKahveBoy() {
        return kahveBoy;
    }

    public void setKahveBoy(String kahveBoy) {
        this.kahveBoy = kahveBoy;
    }

    public String getSutluMü() {
        return sutluMü;
    }

    public void setSutluMü(String sutluMü) {
        this.sutluMü = sutluMü;
    }

    public String getSekerliMi() {
        return sekerliMi;
    }

    public void setSekerliMi(String sekerliMi) {
        this.sekerliMi = sekerliMi;
    }
}
