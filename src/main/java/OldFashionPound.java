import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OldFashionPound {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.next();
        Pattern pattern = Pattern.compile("\\s*(\\d+)p\\s*(\\d+)s\\s*(\\d+)d\\s*([-+])" +
                "\\s*(\\d+)p\\s*(\\d+)s\\s*(\\d+)d\\s*");
        Matcher matcher = pattern.matcher(operation);
        System.out.println(matcher.matches());

        int pounds = Integer.parseInt(matcher.group(1));
        int shillings = Integer.parseInt(matcher.group(2));
        int pences = Integer.parseInt(matcher.group(3));
        String sign =matcher.group(4);
        int secondArgumentPounds = Integer.parseInt(matcher.group(5));
        int secondArgumentShillings = Integer.parseInt(matcher.group(6));
        int secondArgumentPences = Integer.parseInt(matcher.group(7));



        SumSubtraction sum = new SumSubtraction(pounds, shillings, pences, sign,
                secondArgumentPounds, secondArgumentShillings, secondArgumentPences);
        sum.calculate();



        operation = scanner.next();
        pattern = Pattern.compile("\\s*(\\d+)p\\s*(\\d+)s\\s*(\\d+)d\\s*([*\])" +
                "\\s*(\\d+)\\s*");
        matcher = pattern.matcher(operation);
        System.out.println(matcher.matches());


        pounds = Integer.parseInt(matcher.group(1));
        shillings = Integer.parseInt(matcher.group(2));
        pences = Integer.parseInt(matcher.group(3));
        sign =matcher.group(4);
        int secondArgument = Integer.parseInt(matcher.group(5));



        MultiplicationDivision mol = new MultiplicationDivision(pounds, shillings, pences, sign,
                secondArgument);

        mol.calculate();


    }

}