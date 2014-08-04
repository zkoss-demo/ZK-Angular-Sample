package demo.basic;
import org.zkoss.bind.annotation.NotifyChange;

public class BasicViewModel {
    private String firstName;

    @NotifyChange("fullName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return (firstName == null ? "" : firstName) + " Potter";
    }
}