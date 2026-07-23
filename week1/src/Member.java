public class Member extends Person{
    private String email;

    public Member(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return  super.toString()+ "Member{" +
                "email='" + email + '\'' +
                '}';
    }
}
