public class Main {
    public static void main(String args[]) {
        Computer[] arr = new Computer[6];
        Laptop laptop1 = new Laptop();
        laptop1.Laptop(1, "очень", "лень", "выдумывать", "характеристики", "этих", "агрегатов");
        arr[0] = laptop1;

        Netbook netbook1 = new Netbook();
        netbook1.Netbook(2, "intel", "16gb", "hdd 1000tb", "amd 300", "hqd", "hyperY");
        arr[1] = netbook1;

        Desktop desktop1 = new Desktop();
        desktop1.Desktop(3, "ryzen", "8gb", "ssd 255gb", "gtx 660 ti");
        arr[2] = desktop1;

        Nettop nettop1 = new Nettop();
        nettop1.Nettop(4, "intel i", "4gb", "ssd 255 + hdd 512");
        arr[3] = nettop1;

        Monoblock monoblock1 = new Monoblock();
        monoblock1.Monoblock(5, "intel", "2gb", "ssd 512", "NEC");
        arr[4] = monoblock1;

        Server server1 = new Server();
        server1.Server(6, "2 * ryzen", "1000gb", "ssd 100000 gb");
        arr[5] = server1;
        System.out.println("!@#$#$$");
        for (int i = 0; i < 6; i++) {
            arr[i].switch_on();
            System.out.println("---------------------------------------------");
            arr[i].connect_to_internet();
            System.out.println("---------------------------------------------");
            arr[i].switch_off();
            System.out.println("---------------------------------------------");
        }
    }

}