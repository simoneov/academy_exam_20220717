import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SumSubtraction {

    int pounds;
    int shillings;
    int pences;


    String sign;

    int secondNumberPounds;
    int secondNumberShillings;
    int secondNumberPences;


    public void calculate() {
        int totalPences;

        if (this.sign.equals("+")) {
            totalPences = ((this.pounds * 240) + (this.shillings * 12) + (this.pences)) +
                    ((this.secondNumberPounds * 240) + (this.secondNumberShillings * 12) + (this.secondNumberPences));
            int resultPounds = totalPences / 240;
            int resultShillings = (totalPences % 240) / 12;
            int resultPences = totalPences - (resultPounds * 240) - (resultShillings * 12);
            System.out.printf("%sp %ss %sd\n", resultPounds, resultShillings, resultPences);

        } else {
            totalPences = ((this.pounds * 240) + (this.shillings * 12) + (this.pences)) -
                    ((this.secondNumberPounds * 240) + (this.secondNumberShillings * 12) + (this.secondNumberPences));
            int resultPounds = totalPences / 240;
            int resultShillings = (totalPences % 240) / 12;
            int resultPences = totalPences - (resultPounds * 240) - (resultShillings * 12);
            System.out.printf("%sp %ss %sd\n", resultPounds, resultShillings, resultPences);
        }
    }


}
