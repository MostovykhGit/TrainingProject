import java.math.BigDecimal;
import java.lang.StringBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Vector {

    double x_cord, y_cord, z_cord;
    public Vector(double x, double y, double z) {
        this.x_cord = x;
        this.y_cord = y;
        this.z_cord = z;
    }
    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(this.x_cord * this.x_cord + this.y_cord * this.y_cord + this.z_cord * this.z_cord);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return this.x_cord * vector.x_cord + this.y_cord * vector.y_cord + this.z_cord * vector.z_cord;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        Vector new_one = new Vector( (this.y_cord * vector.z_cord - this.z_cord * vector.y_cord),  (this.x_cord * vector.z_cord - this.z_cord * vector.x_cord )  ,
                (this.x_cord * vector.y_cord - this.y_cord * vector.x_cord) );
        return new_one;
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return scalarProduct(vector) / (this.length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        Vector new_one = new Vector(this.x_cord + vector.x_cord, this.y_cord + vector.y_cord, this.z_cord + vector.z_cord);
        return new_one;
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        Vector new_one = new Vector (this.x_cord - vector.x_cord, this.y_cord - vector.y_cord, this.z_cord - vector.z_cord);
        return new_one;
    }

    @Override
    public boolean equals(Object smth) {
        if (this == smth) {
            return true;
        }
        if ((smth == null) || (this.getClass() != smth.getClass())) {
            return false;
        }
        Vector vector = (Vector) smth;
        return ((this.x_cord == vector.x_cord) && (this.y_cord == vector.y_cord) && (this.z_cord == vector.z_cord));
    }

    /*public int hashCode() {
        int changed_x = (int) (this.x_cord * Math.pow(10, BigDecimal.valueOf(x_cord).scale() + 2)); // хочу получить Double без запятой
        String str_x = Integer.toString(changed_x);
        int changed_y = (int) (this.y_cord * Math.pow(10, BigDecimal.valueOf(y_cord).scale() + 2)); // хочу получить Double без запятой
        String str_y = Integer.toString(changed_y);
        int changed_z = (int) (this.z_cord * Math.pow(10, BigDecimal.valueOf(z_cord).scale() + 2)); // хочу получить Double без запятой
        String str_z = Integer.toString(changed_z);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++){ // конкатенируем строки какое-то кол-во раз
            sb.append(str_x);
        }
        for (int i = 0; i < 5; i++){
            sb.append(str_y);
        }
        for (int i = 0; i < 7; i++){
            sb.append(str_z);
        }
        String result = sb.toString();
        Integer answer = 0;
        //answer = Integer.parseInt(result);
        try {
            Integer answer = Integer.parseInt(result);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
        return answer;
    }*/

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int hashCode() {

        int changed_x = (int) (this.x_cord * Math.pow(10, BigDecimal.valueOf(this.x_cord).scale() + 1)); // хочу получить Double без запятой
        int changed_y = (int) (this.y_cord * Math.pow(10, BigDecimal.valueOf(this.y_cord).scale() + 1)); // хочу получить Double без запятой
        int changed_z = (int) (this.z_cord * Math.pow(10, BigDecimal.valueOf(this.z_cord).scale() + 1)); // хочу получить Double без запятой

        int smth1 = changed_x * 3 + changed_y * 5 + changed_z * 7;
        String smth2 = Integer.toString(smth1);
        smth2 = reverseString(smth2);

        //System.out.println(smth2);
        Integer answer = 0;
        try {
            answer = Integer.parseInt(smth2);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }

        return answer;
    }

    public static void main(String[] args) {
        Double x1, y1, z1, x2, y2, z2;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите 3 координаты первого вектора: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        z1 = scanner.nextDouble();

        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        z2 = scanner.nextDouble();

        Vector vec1 = new Vector(x1, y1, z1);
        Vector vec2 = new Vector(x2, y2, z2);

        System.out.println("Длина первого: " + vec1.length());
        System.out.println("Длина втоого: " + vec2.length());
        System.out.println("Скалярное произвеение: " + vec1.scalarProduct(vec2));
        System.out.println("Векторное произведение: " + vec1.crossProduct(vec2).x_cord + ", " + vec1.crossProduct(vec2).y_cord + ", " + vec1.crossProduct(vec2).z_cord + ")");
        System.out.println("Cos: " + vec1.cos(vec2));
        System.out.println("Сумма векторов: (" + vec1.add(vec2).x_cord + ", " + vec1.add(vec2).y_cord + ", " + vec1.add(vec2).z_cord + ")");
        System.out.println("Разность векторов: (" + vec1.subtract(vec2).x_cord + ", " + vec1.subtract(vec2).y_cord + ", " + vec1.subtract(vec2).z_cord + ")");
        System.out.println("Равны ли: " + vec1.equals(vec2));
        System.out.println("HashCode первого: " + vec1.hashCode());
        System.out.println("HashCode первого: " + vec1.hashCode());

    }

}
