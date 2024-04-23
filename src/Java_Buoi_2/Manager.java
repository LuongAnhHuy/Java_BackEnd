package Java_Buoi_2;


public class Manager extends Employee{

    public void inThongTinCapDuoi(){
        if (employees != null) {
            for (Employee employee : employees){
                employee.inThongTin();
                if (employee instanceof Manager){
                    System.out.println("Thong tin cap duoi cua: " + employee.getName() + " la: " );
                    Manager manager = (Manager) employee;
                    manager.inThongTinCapDuoi();
                }
            }
        }
    }



}
