package lesson_12_string_regular_expressions;

public class MyStringBuilder {
    public static void main(String[] args) {
        //
        getCalculatorExpression("123+45/56");
    }

    public static void getStringBuilder(){
        // String Pool optimization
        // We need NEW because there is no optimization only for STRING

        // To work on dynamic String
        // To change values of the String data
        StringBuilder strBuilder = new StringBuilder("A COURSE JAVA");

        String java = "Java";

        // String does not allow my dynamic change
        for (int index = 0; index < java.length(); index++){
            System.out.print(java.charAt(index) + "\t");
        }

        System.out.println("\n*********************************************\n");

        for (int index = 0; index < strBuilder.length(); index++){
            System.out.print(strBuilder.charAt(index) + "\t");

            if (strBuilder.charAt(index) == 'A'){
                strBuilder.setCharAt(index, '!');
            }
        }

        System.out.println();
        System.out.println(strBuilder);

        System.out.println();

        // If methods are applied to String they don't change the original
        // In StringBuilder they change the original
        System.out.println(strBuilder.reverse());

        strBuilder.append("Archil");

        System.out.println(strBuilder);
    }

    public static void getCalculatorExpression(String expression){
        StringBuilder expressionBuild = new StringBuilder(expression);

        // Dynamic change in the String
        // go for StringBuilder -> add value, delete value, insert in the middle
        // 15+4 -> Backspace, delete the last element
        expressionBuild.deleteCharAt(expressionBuild.length() - 1); // index value

        // In-depth work with the String
        // From dynamic to analysis, split 14+5=10
        // Go from StringBuilder to String
        System.out.println(expressionBuild);
    }
}
