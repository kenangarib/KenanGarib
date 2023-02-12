package az.coder.task1.Reflection;

public class elebele {
    public String isim;
    public String soyisim;
    public int maas;
    private int id;
    private float exeriance;

    elebele() {
        System.out.println("default");
    }

    public elebele(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
        System.out.println("public constructor");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getExeriance() {
        return exeriance;
    }

    public void setExeriance(float exeriance) {
        this.exeriance = exeriance;
    }

    public String isimSoyisimGetir() {
        System.out.println("method");
        return this.isim+" "+this.soyisim;
    }
    public void maasDegis(int maas){
        this.maas=maas;
    }

}
