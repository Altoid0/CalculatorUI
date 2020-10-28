// Dhruv K
package model;
// Declare Solver Model class
public class SolverModel {
    // initializing variables to solve with
    private double veli;
    private double velf;
    private double acc;
    private double time;
    private double deltax;

    public SolverModel() { //constructor default sets
        veli = 0.0;
        velf = 0.0;
        acc = 0.0;
        time = 0.0;
        deltax = 0.0;
    }

    // setters for all the variables
    public void setVeli(double value) { // set velocity initial
        veli = value;
    }

    public void setVelf(double value) { // set velocity final
        velf = value;
    }

    public void setAcc(double value) { // set acceleration
        acc = value;
    }

    public void setTime(double value) { // set time
        time = value;
    }

    public void setDeltax(double value) { // set deltax
        deltax = value;
    }
}
