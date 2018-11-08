public class NthrootCalculator {

    // x is the base and n is the power


    public double nroot(Double base, Double n){
        double result = Math.pow(Math.E ,Math.log(base)/n);
        return result;
    }
}
