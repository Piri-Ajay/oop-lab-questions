public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();

        Lecturer l1 = new Lecturer("Ajay", "L01", "IT", 3, 50000);
        Lecturer l2 = new Lecturer("Kumar", "L02", "CS", 2, 60000);
        LabAssistant la1 = new LabAssistant("Ravi", "LA01", "Physics", 100, 200);

        l1.changeDepartment("Software Engineering");

        l1.displayLecturerDetails();
        System.out.println("Payment: " + l1.calculateMonthlyPayment());

        l2.displayLecturerDetails();
        System.out.println("Payment: " + l2.calculateMonthlyPayment());

        la1.displayLabAssistantDetails();
        System.out.println("Payment: " + la1.calculateMonthlyPayment());

        double total = l1.calculateMonthlyPayment() +
                       l2.calculateMonthlyPayment() +
                       la1.calculateMonthlyPayment();

        System.out.println("Total Payment: " + total);

        System.out.println("Total Staff: " + StaffMember.getStaffCount());

        l1.showCommonNotice();
        l2.showCommonNotice();
        la1.showCommonNotice();
    }
}
