public abstract class PortableComputer extends ComputerImpl{
    int number;
    String cpu;
    String ram;
    String hard_disk;
    String graphics_card;
    Monitor monitor;
    Keyboard keyboard;
    abstract public void switch_on();
    abstract public void switch_off();
    abstract public void connect_to_internet();
}
