public class NthrootCalculator {

    // x is the base and n is the power
    //  n root of x => x^(1/n) => e^(lnx/n)

    public double nroot(Double base, Double n){
        double result = Math.pow(Math.E ,Math.log(base)/n);
        return result;
    }
}
