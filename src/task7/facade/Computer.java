package task7.facade;

public class Computer {
    private final CPU cpu;
    private final RAM ram;
    private final SSD ssd;

    public Computer(){
        this.cpu = new CPU();
        this.ram = new RAM();
        this.ssd = new SSD();
    }

    public void start() {
        cpu.start();
        ram.load();
        ssd.read();
    }
}
