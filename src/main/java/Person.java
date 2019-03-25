import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Person {
    @DatabaseField(generatedId = true)
    private long personId;
    @DatabaseField(canBeNull = false)
    private String fname;
    @DatabaseField
    private String mname;
    @DatabaseField(canBeNull = false)
    private String lname;

    public long getPersonId() {
        return personId;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
