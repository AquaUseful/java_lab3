package lab3_1;

public class ArtDirector {
    // ** Имя */
    private String fistName;
    // ** Отчество */
    private String middleName;
    // ** Фамилия */
    private String lastName;
    // ** Стаж работы в годах */
    private int workExpYears;

    public ArtDirector() {
        this.fistName = null;
        this.middleName = null;
        this.lastName = null;
        this.workExpYears = 0;
    }

    public ArtDirector(String fistName, String middleName, String lastName, int workExpYears) throws EmptyAttribute {
        this.setFirstName(fistName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
    }

    public void setFirstName(String firstName) throws EmptyAttribute {
        if (firstName.isEmpty() || firstName.isBlank()) {
            throw new EmptyAttribute("имя");
        }
        this.fistName = firstName;
    }

    public void setMiddleName(String middleName) throws EmptyAttribute {
        if (middleName.isEmpty() || middleName.isBlank()) {
            throw new EmptyAttribute("отчество");
        }
        this.middleName = middleName;
    }

    public void setLastName(String lastName) throws EmptyAttribute {
        if (lastName.isEmpty() || lastName.isBlank()) {
            throw new EmptyAttribute("фамилия");
        }
        this.lastName = lastName;
    }

    public void setWorkExpYears(int years) {
        if (years < 0) {
            years = 0;
        }
        this.workExpYears = years;
    }

    public String getFisrtName() {
        return this.fistName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getWorkExpYears() {
        return this.workExpYears;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.fistName + " " + this.middleName;
    }

}
