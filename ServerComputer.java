abstract public class ServerComputer extends ComputerImpl{
    int number;
    String cpu;
    String hard_disk;
    String ram;
    abstract public void switch_on();
    abstract public void switch_off();
    abstract public void connect_to_internet();
}
