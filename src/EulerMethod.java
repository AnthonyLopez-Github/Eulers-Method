/*
Eulers Method:
Xn=xn-1+h, yn=yn-1+h*F(Xn-1, Yn-1)

Where:
'h' is the step size and 'n' is the amount of steps.
F is the slope which is the DE.
*/

// Hard coded derivative: y+xy
public class EulerMethod {
    static float getPercentError(float realY, float approxY) {
        return ((approxY - realY) / realY) * 100;
    }
    static float actualFunction(float x) {
        return (float) (Math.exp(x) * Math.exp(0.5 * Math.pow(x, 2)));
    }
    static float nextXValue(float oldX, float stepSize) {
        return oldX + stepSize;
    }
    static float derivativeFunction(float x, float y) {
        return y + (x * y);
    }
    static float nextYValue(float oldX, float oldY, float stepSize) {
        return oldY + (stepSize * derivativeFunction(oldX, oldY));
    }
}
