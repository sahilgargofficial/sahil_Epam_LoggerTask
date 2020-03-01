package InterestCalculator;

abstract class Interest {
    float time;
    double principal;
    float rate;
    protected Interest(double principal,float time,float rate)
    {
        this.time = time;
        this.principal = principal;
        this.rate = rate;
    }
    abstract double interestCalculate();
}
