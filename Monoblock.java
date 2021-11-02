public class Monoblock extends TableComputer{
    Monitor monitor;
    public void Monoblock(int number1, String cpu1, String ram1, String hard_disk1, String monitor_name1) {
        this.number = number1;
        this.cpu = cpu1;
        this.ram = ram1;
        this.hard_disk = hard_disk1;
        this.monitor = new Monitor();
        this.monitor.Monitor(monitor_name1);
    }
    public void switch_on() {
        System.out.println("Моноблок № " + this.number + " со следующими характеристиками:");
        System.out.println("cpu: " + this.cpu);
        System.out.println("ram: " + this.ram);
        System.out.println("hard_disk: " + this.hard_disk);
        System.out.println("monitor: " + this.monitor.name_monitor);
        System.out.println("Включен");
    }
    public void switch_off() {
        System.out.println("Моноблок № " + this.number + " со следующими характеристиками:");
        System.out.println("cpu: " + this.cpu);
        System.out.println("ram: " + this.ram);
        System.out.println("hard_disk: " + this.hard_disk);
        System.out.println("monitor: " + this.monitor.name_monitor);
        System.out.println("Выключен");
    }
    public void connect_to_internet() {
        System.out.println("Моноблок № " + this.number + " со следующими характеристиками:");
        System.out.println("cpu: " + this.cpu);
        System.out.println("ram: " + this.ram);
        System.out.println("hard_disk: " + this.hard_disk);
        System.out.println("monitor: " + this.monitor.name_monitor);
        System.out.println("Подключен к интернету");
    }
}
