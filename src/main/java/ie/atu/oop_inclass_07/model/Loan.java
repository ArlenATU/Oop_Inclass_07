package ie.atu.oop_inclass_07.model;

public class Loan {
    private String loanID;
    private String loanTag;
    private String studentEmail;
    private int loanDate;
    private int startHour;
    private int durationHours;

    public Loan() {};

    public Loan(String loanID, String loanTag, String studentEmail, int loanDate, int startHour, int durationHours) {
        this.loanID = loanID;
        this.loanTag = loanTag;
        this.studentEmail = studentEmail;
        this.loanDate = loanDate;
        this.startHour = startHour;
        this.durationHours = durationHours;
    }


}
