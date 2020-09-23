public class Fraction {

    private float numerateur;
    private float denominateur;
    private float fraction;

    public Fraction(float numerateur,float denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        this.fraction = this.numerateur/this.denominateur;
    }

    public float getFraction() {
        return fraction;
    }

    public float getDenominateur() {
        return denominateur;
    }

    public float getNumerateur() {
        return numerateur;
    }

    public String toString() {
        return this.numerateur+"/"+this.denominateur+" = "+this.fraction;
    }


}
