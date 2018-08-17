package cloudnative.microservices.addition.domain;

public class Addition {

	 // Both factors
    private int factorA;
    private int factorB;

    // The result of the operation A + B
    private int result;

    public Addition(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA + factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result(A+B)=" + result +
                '}';
    }

}
