public class Student {
    private String student;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student(){
    }

    public Student(String n, String a, int ag, double mg, double eg, double sg){
        name = n;
        address = a;
        age = ag;
        englishGrade = eg;
        mathGrade = mg;
        scienceGrade = sg;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
    }

    public void setEnglish(int english){
        englishGrade = english;
    }

    public void setScience(int science){
        scienceGrade = science;
    }

    public double getAverage(){
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade)/3;
        return result;
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
    }

    public boolean statusAkhir(){
        if (mathGrade, scienceGrade, englishGrade >= 61){
            return lolos;
        } else {
            return remidi;
        }


    }
}
