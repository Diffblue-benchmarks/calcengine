package com.diffblue.calcengine;

public class App {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 'm');
        equations[3] = create(11.0d, 3.0d, 'm');


        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;

    }

}
