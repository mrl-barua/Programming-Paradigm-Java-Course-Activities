
package sample;
// last modified : April 25, 2021 11:40pm by Cedrick James Felicitas 
// 

/*This class is only mesant for handling and storing the datas
  this class can be MODIFIABLE and you can add some more attributes in here

*/
public class Patient {
    private String namePatient, agePatient;

    public Patient(String namePatient, String agePatient) {
        this.namePatient = namePatient;
        this.agePatient = agePatient;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getAgePatient() {
        return agePatient;
    }

    public void setAgePatient(String agePatient) {
        this.agePatient = agePatient;
    }
    
}
