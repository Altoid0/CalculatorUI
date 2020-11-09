// Dhruv K
package control;
import java.lang.Math;
import view.SolverUI;
public class PhysicsSolv {
    // enumerator list to include new functions
    public static enum KINOPERATOR { NOOP, VI, VF, ACC, TIME, DIST };
    public static double solveIt(double vi, double vf, double acc, double time, double dist, KINOPERATOR kinematicvar, String missingparam ) {
        double SolveAnswer = 0;
        switch(kinematicvar) {
            case VI:
                switch (missingparam) {
                    case "Displacement": SolveAnswer = vf-acc*time; break;
                    case "Final Velocity": SolveAnswer = 1/time*(dist-0.5*acc*time*time); break;
                    case "Acceleration": SolveAnswer = 2*dist/time-vf; break;
                    case "Time": SolveAnswer = Math.sqrt((vf*vf-2*acc*dist)); break;
                }
                break;
            case VF:
                switch (missingparam) {
                    case "Displacement": SolveAnswer = vi+acc*time; break;
                    case "Initial Velocity": SolveAnswer = 1/time*(dist+0.5*acc*time*time); break;
                    case "Acceleration": SolveAnswer = 2*dist/time-vi; break;
                    case "Time": SolveAnswer = Math.sqrt((vi*vi+2*acc*dist)); break;
                }
                break;
            case ACC:
                switch (missingparam) {
                    case "Displacement": SolveAnswer = 1/time*(vf-vi); break;
                    case "Final Velocity": SolveAnswer = 2/(time*time)*(dist-vi*time); break;
                    case "Initial Velocity": SolveAnswer = -2/(time*time)*(dist-vf*time); break;
                    case "Time": SolveAnswer = 1/(2*dist)*(vf*vf-vi*vi); break;
                }
                break;
            case TIME:
                switch (missingparam) {
                    case "Displacement": SolveAnswer = 1/acc*(vf-vi); break;
                    //Try and find a fix for these two in the future
                    case "Final Velocity": SolveAnswer = 0.0; break;
                    // This one as well
                    case "Initial Velocity": SolveAnswer = 0.0; break;
                    case "Acceleration": SolveAnswer = 2*dist/(vf+vi); break;
                }
                break;
            case DIST:
                switch (missingparam) {
                    case "Initial Velocity": SolveAnswer = vf*time-0.5*acc*time*time; break;
                    case "Final Velocity": SolveAnswer = vi*time+0.5*acc*time*time; break;
                    case "Acceleration": SolveAnswer = 0.5*(vf+vi)*time; break;
                    case "Time": SolveAnswer = 1/(2*acc)*(vf*vf-vi*vi); break;
                }
                break;
            case NOOP:
                break;

        }
        return SolveAnswer;
    }

}
