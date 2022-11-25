public class Main {
    public static void main(String[] args){

        //membuat object
        manager gaklengkap = new manager ("Upin");
        manager sedang = new manager ("Ipin ", 500000);
        manager lengkap = new manager("Mail", 6000000, 2000000);

        programmer gaklengkapprogrammer = new programmer ("Nobita");
        programmer sedangprogrammer = new programmer ("Shuneo", 500000);
        programmer lengkapprogrammer = new programmer("Doraemon", 6000000, 500000);

        gaklengkap.cetakInfo();
        sedang.cetakInfo();
        lengkap.cetakInfo();

        gaklengkapprogrammer.cetakInfo();
        sedangprogrammer.cetakInfo();
        lengkapprogrammer.cetakInfo();
        
    }
}