import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Patient patient = new Patient("Paul", "paulmrg461@gmail.com");

        Doctor doctor = new Doctor("Emilio", "hetortolo@gmail.com");
        doctor.addAvailableAppointment(new Date(), "4pm");
        doctor.addAvailableAppointment(new Date(), "6pm");
        doctor.addAvailableAppointment(new Date(), "8pm");

        User user = new Doctor("Paul Realpe", "paulmrg461@gmail.com");
        user.showDataUser();

        User user1 = new User("Hetor Tolas", "hetortolaino@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("El doctor "+getName()+ " pertenece al Hospital de la santísima Tola");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        /*for (Doctor.AvailableAppointment availableAppointment : doctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/
        System.out.println(doctor);

        System.out.println(patient);
    }
}
