package Java_BE;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private static List<Integer> time = new ArrayList<>();
    public void inThongTinCapDuoi(){
        if (employees != null) {
            for (Employee employee : employees){
                employee.inThongTin();
                employee.inThoiGianLamViec();
                if (employee instanceof Manager){
                    Manager manager = (Manager) employee;
                    manager.inThongTinCapDuoi();
                    if (name.equals("Truong phong 2")){
                        time.add(employee.getThoiGianLamViec());
                    }
                    insertionSort(time, time.size());

                }

            }
        }
    }

//    public void inTime() {
//        if (name.equals("Truong phong 2")){
//            for(Employee e:employees){
//                time.add(e.getThoiGianLamViec());
//            }
//            insertionSort(time,time.size());
//        }
//    }

    void insertionSort(List<Integer> workingTime, int array_size) {
        int i, j, last;
        for (i=1; i < array_size; i++) {
            last = workingTime.get(i);
            j = i;
            while ((j > 0) && (workingTime.get(j - 1) > last)) {
                workingTime.set(j, workingTime.get(j - 1));
                j = j - 1; }
            workingTime.set(j, last);
        }
        Integer thoiGianLamViec = workingTime.get(array_size-1);
        System.out.println("So nam lam viec nhieu nhat la : " + thoiGianLamViec);
    }



}
