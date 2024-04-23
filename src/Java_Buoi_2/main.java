package Java_Buoi_2;

public class main {
    public static void main(String[] args){
        Manager tongGiamDoc = new Manager();
        tongGiamDoc.setName("Tong gian doc A");
        tongGiamDoc.setNumberID("0");



        Manager truongPhong1 = new Manager();
        truongPhong1.setName("Truong phong 1");
        truongPhong1.setNumberID("1");

        Employee employee1 = new Employee();
        employee1.setName("Nhan vien 1");
        employee1.setNumberID("1.1");
        truongPhong1.addEmployee(employee1);

        Manager truongPhong2 = new Manager();
        truongPhong2.setName("Truong phong 2");
        truongPhong2.setNumberID("2");

        Employee employee2 = new Employee();
        employee2.setName("Nhan vien 2");
        employee2.setNumberID("2.1");

        Employee employee3 = new Employee();
        employee3.setName("Nhan vien 3");
        employee3.setNumberID("3.1");

        truongPhong2.addEmployee(employee2);
        truongPhong2.addEmployee(employee3);

        tongGiamDoc.addEmployee(truongPhong1);
        tongGiamDoc.addEmployee(truongPhong2);

        tongGiamDoc.inThongTinCapDuoi();

    }
}
