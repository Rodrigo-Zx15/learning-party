/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zx
 */
class NodeProcesso {
    int size;
    int priority;
    boolean inputOutput;
    NodeProcesso next;
    public NodeProcesso(int prio, int siz, boolean es){
        setPriority(prio);
        this.size = siz;
        this.inputOutput = es;
        next = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        
        this.size = size;
    }

    public int getPriority() {
        return priority;
    }
    public boolean getInputOutput(){
        return inputOutput;
    }
    private void setPriority(int priority) {
        if(priority <= 0){
            priority = 1;            
        }
        this.priority = priority;
    }
}
