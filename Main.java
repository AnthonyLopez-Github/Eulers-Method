// DE: dy/dx = y+xy
// Initial value: y(0) = 1
// Step Size (h): 0.1
// Actual Function: y = e^x * e^(1/2*x^2)

/*
To Do:
- Let user enter a custom derivative, step size, and step amount
- Graph the approximation
- Show slope for the segments when displayed
*/

public class Main {
    public static void main(String[] args) {
        int stepAmount = 100;
        float step = 1E-2f; // h

        float oldX = 0f;
        float oldY = 1.0f;

        System.out.printf("Initial Values:\nX: %f\nY: %f\n\n", oldX, oldY);

        for(int i = 0 ; i < stepAmount ; i++) {
            float newX = EulerMethod.nextXValue(oldX, step);
            float newY = EulerMethod.nextYValue(oldX, oldY, step);

            float realY = EulerMethod.actualFunction(newX);

            System.out.printf("X: %f, Y_hat: %f, Y: %f, Percent Error: %f\n", newX, newY, realY, EulerMethod.getPercentError(realY, newY));

            oldX = newX;
            oldY = newY;
        }
    }
}