package src;

public class calcMDC {

    int contador = 0;
    
    public int mdc(int dividendo, int divisor) {
        contador++;
        if (dividendo % divisor == 0) {
            return divisor;
        }
        return mdc(divisor, dividendo % divisor);
    }

}