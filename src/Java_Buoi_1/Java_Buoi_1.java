package Java_Buoi_1;

public class Java_Buoi_1 {
//    public static void main(String[] args) {
//        int a = 20;
//        int b = a++;
//        int c = ++a;
//        System.out.println("b= " + b);
//        System.out.println("c= " + c);
//    }

    // if
    // if - else
    // if - else - if

    public static void main(String[] args) {
//        int a = 20;
//        int b = 3;
//        int sodu = a%b;
        int a = 0, sum =0;
        do {
            sum += a;
            a++;
        }while (a<=5);
        System.out.println("Tong la: " + sum);
        }
//        if (sodu == 0){
//            System.out.println("A chia het cho B");
//        }else{
//            System.out.println("A khong chia het cho B");
//        }

        // Switch case
//        switch (sodu) {
//            case 0:
//                System.out.println("A chia b du 0");
//                break;
//            case 1:
//                System.out.println("A chia b du 1");
//                break;
//            case 2:
//                System.out.println("A chia b du 2");
//                break;
//        }

        // Vong lap for
//        int sum = 0;
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//        int phantu1= arr[0];
//
//        for (int i = 0; i < 10; i++) {
//            int phantu = arr[i];
//            if (phantu % 2 == 0){
//                sum += phantu;
//            }
//            System.out.println("Tong la: " + sum);
//        }
//    }

//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0){
//                //sum = 0, i = 1
//                sum += i;
//            }
//            System.out.println("in ra i = " + i);
//        }
//        System.out.println("Tong la: " + sum);
//    }
    static boolean checkDieuKien(int sodu){
        return sodu ==0;
    }

}
