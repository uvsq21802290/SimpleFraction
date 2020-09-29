public class Fraction {

    private int numerateur;
    private int denominateur;
    private int fraction;

    public Fraction(int numerateur,int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        this.fraction = this.numerateur/this.denominateur;
    }

    public int getFraction() {
        return fraction;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public String toString() {
        //return "" + this.fraction;
        return this.numerateur+"/"+this.denominateur+" = "+this.fraction;
    }
}
