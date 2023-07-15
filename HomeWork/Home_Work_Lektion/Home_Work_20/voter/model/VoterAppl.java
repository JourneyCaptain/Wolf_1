package Home_Work_20.voter.model;
import java.time.LocalDate;

public class VoterAppl {
    public static void main(String[] args) {
        // Пример использования класса Voter
        LocalDate birthDate1 = LocalDate.of(2000, 6, 15); // Date of birth June 15, 2000
        LocalDate birthDate2 = LocalDate.of(2010, 3, 25); //Date of birth March 25, 2010

        Voter voter1 = new Voter("George Washington", birthDate1);
        Voter voter2 = new Voter("Wladimir Schirinowski", birthDate2);

        // Проверка наличия права голоса для избирателей
        if (voter1.isEligible()) {
            System.out.println(voter1.getName() + " has a right to vote.");
        } else {
            System.out.println(voter1.getName() + " has no right to vote.");
        }

        if (voter2.isEligible()) {
            System.out.println(voter2.getName() + " has a right to vote.");
        } else {
            System.out.println(voter2.getName() + " has no right to vote.");
        }
    }
}

