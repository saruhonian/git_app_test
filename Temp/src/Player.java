public abstract class Player {

    private String lastname;
    private String firstname;
    private String middlename;
    private int age;

    private char type;

    public Player(String lastname, String firstname, String middlename, int age, char type) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public boolean equqls(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != Player.class) {
            return false;
        }
        Player player = (Player) obj;

        if (this.lastname == null ||
                this.firstname == null ||
                this.middlename == null ||
                this.age == 0 ||
                this.type == 0) {
            return false;
        }

        if (this.lastname.equals(player.lastname) &&
                this.firstname.equals(player.firstname) &&
                this.middlename.equals(player.middlename) &&
                this.age == player.age &&
                this.type == player.type) {
            return true;
        }
        return false;
    }

    public String toString() {
        return firstname + " " + lastname;
    }

    public abstract String makeMove();
}