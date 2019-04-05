package composition;

import java.lang.reflect.Method;

public class PC {
    private MotherBoard motherBoard;
    private Case theCase;
    private Monitor monitor;

    public PC(){
    }
    public PC(MotherBoard motherBoard,Case theCase, Monitor monitor){
        this.motherBoard = motherBoard;
        this.theCase = theCase;
        this.monitor = monitor;
    }
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
    public Case getTheCase() {
        return theCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    //methods
    private void drawLogo(){
        monitor.drawPixelAt( 12500,50, "yellow");
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Windows");
    }
}
