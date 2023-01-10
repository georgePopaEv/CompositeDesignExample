import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor teachnologyDean = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr. John", "Chair of Math Department");
        Supervisor chairOfComputerScienceDepartment = new Supervisor("Dr. Ian", "Chair of CS Department");

        Professor mathProf1 = new Professor("Math Professor1","Adjunct", 302);
        Professor mathProf2 = new Professor("Math Professor2","Associate", 303);

        Professor cseProf1 = new Professor("CSE Professor1","Adjunct", 507);
        Professor cseProf2 = new Professor("CSE Professor2","Professor", 508);
        Professor cseProf3 = new Professor("CSE Professor3","Professor", 509);

        teachnologyDean.add(chairOfMathDepartment);
        teachnologyDean.add(chairOfComputerScienceDepartment);

        // Professors of Mathematics directly reports to chair of math
        chairOfMathDepartment.add(mathProf1);
        chairOfMathDepartment.add(mathProf2);

        //Professors of Computer SC. directly reports to chair of computer science
        chairOfComputerScienceDepartment.add(cseProf1);
        chairOfComputerScienceDepartment.add(cseProf2);
        chairOfComputerScienceDepartment.add(cseProf3);

        System.out.println("*** Composite Pattern Demo ***");
        System.out.println("\n The college has the following structure\n");
        System.out.println(teachnologyDean.getDetails());
        List<Faculty> chairs = teachnologyDean.getMyFaculty();
        List<Faculty> mathChairs = chairOfMathDepartment.getMyFaculty(); // o lista cu subalternii acestora
        List<Faculty> csDept = chairOfComputerScienceDepartment.getMyFaculty();
        int ok = 0;
        for (Faculty f : chairs){
            System.out.println("\t" + f.getDetails());
            ok++;
            if (ok == 2)
                continue;
            for (Faculty fm : mathChairs){
                System.out.println("\t\t " + fm.getDetails());
            }
            if (ok == 1)
                continue;
            for (Faculty cs : csDept) {
                System.out.println("\t\t " + cs.getDetails());

            }
        }

    }
}
