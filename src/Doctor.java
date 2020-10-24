public class Doctor {
    static int id = 0;
    String name;
    String specialty;

    Doctor(String name, String specialty){
        this.name = name;
        this.specialty = specialty;
        id++;
    }
    public void showName(){
        System.out.println("Hola, mi nombre es " + name + ", mi número de identificación es: " + id + " y mi especialidad es " + specialty);
    }

}
