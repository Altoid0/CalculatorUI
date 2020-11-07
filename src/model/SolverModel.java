// Dhruv K
package model;
import control.PhysicsSolv.KINOPERATOR;
// Declare Solver Model class
public class SolverModel {
    public double kinematicanswermodel;

    public SolverModel() {
    }
    // Constructor with arguments, passes to control function
    // Dhruv Kanetkar
    public SolverModel(double vi, double vf, double acc, double time, double dist, KINOPERATOR kinematicvar, String missingparam) {
        // Set var equal to the return value of the control function
        // Eventually the goal is to make control into a class and again create the object here to access the answer variable
        this.kinematicanswermodel = control.PhysicsSolv.solveIt(vi, vf, acc, time, dist, kinematicvar, missingparam);
    }
}
