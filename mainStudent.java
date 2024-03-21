public class mainStudent {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Surabaya", 20, 88, 44, 65);
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge((20));
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("===================");
        Student budi = new Student("Budi", "Surabaya", 21, 80, 50, 60);
        budi.setMath(70);
        budi.setScience(60);
        budi.setEnglish(90);
        budi.displayMessage();

        //Siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("Anna", "Batu", 18, 50, 40, 70);
        anna.displayMessage();

        //Siswa dengan nama budi dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("====================");
        budi.setAddress("Jakarta");
        budi.setAge(22);
        budi.displayMessage();
    }
}
