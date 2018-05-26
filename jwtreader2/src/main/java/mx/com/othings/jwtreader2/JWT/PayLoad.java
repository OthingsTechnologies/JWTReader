package mx.com.othings.jwtreader2.JWT;

public class PayLoad {

    private int aud;
    private String jti;
    private int iat;
    private int nbf;
    private int exp;
    private int sub;

    public PayLoad(){}

    public int getAud() {
        return aud;
    }

    public void setAud(int aud) {
        this.aud = aud;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public int getIat() {
        return iat;
    }

    public void setIat(int iat) {
        this.iat = iat;
    }

    public int getNbf() {
        return nbf;
    }

    public void setNbf(int nbf) {
        this.nbf = nbf;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

}
