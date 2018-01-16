package util;

/**
 * Created by H77 on 2017/5/13.
 */
public  class CondVar {
    private boolean value = false;

    public synchronized void waitOn() throws InterruptedException {
        while (!value) {
            wait();
        }
    }
    public synchronized void signal() {
        value = true;
        notifyAll();
    }

}