package com.diffblue.calcengine;

public class App {

        public static void main(String[] args) {
            useMathEquation();
            useCalculatorBase();


            String[] statments = {
                    "add 25.0 92.0", // 25.0 + 92.0 = 117.0
                    "power 5.0 3.0", // 5.0 ^ 3.0 = 125
                    "multiply 200.0 2.0" // 200 * 2.0 = 400
            };


            DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                    new Adder(),
                    new Power(),
                    new Multiplier()
            });

            for(String statement:statments) {
                String output = helper.process(statement);
                System.out.println(output);
            }

        }

        public void useCalculateHelper() {
            String[] statements = {
                    "add 1.0",
                    "add xx 25.0",
                    "addX 0.0 0.0",
                    "divide 100.0 50.0",
                    "add 25.0 92.0",
                    "subtract 225.0 17.0",
                    "multiply 11.0 3.0"};

            CalculateHelper helper = new CalculateHelper();
            for (String statement : statements) {
                try {
                    helper.process(statement);
                    System.out.println(helper);
                } catch (InvalidStatementException e) {
                    System.out.println(e.getMessage());
                    if (e.getCause() != null)
                        System.out.println(" Original exception" + e.getCause().getMessage());
                }

            }
        }

            public static void useMathEquation () {
                MathEquation[] equations = new MathEquation[4];
                equations[0] = new MathEquation('d', 100.0d, 50.d);
                equations[1] = new MathEquation('a', 25.0d, 92.0d);
                equations[2] = new MathEquation('m', 225.0d, 17.0d);
                equations[3] = new MathEquation('m', 11.0d, 3.0d);


                for (MathEquation equation : equations) {
                    equation.execute();
                    System.out.print("result = ");
                    System.out.println(equation.getResult());
                }

                System.out.println();
                System.out.println("Using Overloads");
                System.out.println();


            }


            public static void useCalculatorBase() {

                double leftDouble = 9.0d;
                double rightDouble = 4.0d;

                int leftInt = 9;
                int rightInt = 4;

                MathEquation equationOverload = new MathEquation('d');

                equationOverload.execute(leftDouble, rightDouble);
                System.out.println("result double=");
                System.out.println(equationOverload.getResult());


                equationOverload.execute(leftInt, rightInt);
                System.out.println("result int=");
                System.out.println(equationOverload.getResult());

                equationOverload.execute(leftInt, rightDouble);
                System.out.println("result int and doubs=");
                System.out.println(equationOverload.getResult());

                System.out.println();
                System.out.println("Using Inheritance");
                System.out.println();

                CalculateBase[] calculators = {
                        new Divider(100.0d, 50.0d),
                        new Adder(25.0d, 92.0d),
                        new Subtractor(225.0d, 17.0d),
                        new Multiplier(11.0d, 3.0d)
                };

                for (CalculateBase calculator : calculators) {
                    calculator.calculate();
                    System.out.print("result=");
                    System.out.println(calculator.getResult());

                }

            }

    }


