import lombok.AllArgsConstructor;

@AllArgsConstructor

public class MultiplicationDivision {
    int pounds;
    int shillings;
    int pences;

    String sign;

    int secondOperand;

    public void calculate() {
        int totalPences;

        if (this.sign.equals("*")) {
            totalPences = ((this.pounds * 240) + (this.shillings * 12) + (this.pences)) * this.secondOperand;
            int resultPounds = totalPences / 240;
            int resultShillings = (totalPences % 240) / 12;
            int resultPences = totalPences - (resultPounds * 240) - (resultShillings * 12);
            System.out.printf("%sp %ss %sd\n", resultPounds, resultShillings, resultPences);

        } else {
            totalPences = ((this.pounds * 240) + (this.shillings * 12) + (this.pences))/this.secondOperand;
            int restPences = ((this.pounds * 240) + (this.shillings * 12) + (this.pences))%this.secondOperand;

            int resultPounds = totalPences / 240;
            int resultShillings = (totalPences % 240) / 12;
            int resultPences = totalPences - (resultPounds * 240) - (resultShillings * 12);

            int resultRestPounds = restPences / 240;
            int resultRestShillings = (restPences % 240) / 12;
            int resultRestPences = restPences - (resultRestPounds * 240) - (resultRestShillings * 12);
            if(restPences == 0) {
                System.out.printf("%sp %ss %sd", resultPounds, resultShillings, resultPences);
            }
            else{
                System.out.printf("%sp %ss %sd (%sp %ss %sd)\n", resultPounds, resultShillings, resultPences,
                        resultRestPounds,resultRestShillings,resultRestPences);
            }
        }
    }



}
