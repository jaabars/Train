

public class Student {
    String familyNameMid;
    String phoneNumber;
    boolean isPaid;

    public  Student(String familyNameMid, String phoneNumber, boolean isPaid) {
        this.familyNameMid = familyNameMid;
        this.phoneNumber = phoneNumber;
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "familyNameMid='" + familyNameMid + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isPaid=" + isPaid +
                '}';
    }


}


