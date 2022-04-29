public class Player {
    private String firstName;
    private String lastName;
    private String position;

    public Player(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + position != null ? position.hashCode() : 0;
        return result;
    }
}