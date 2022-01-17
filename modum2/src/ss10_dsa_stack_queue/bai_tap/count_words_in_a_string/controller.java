//package ss10_dsa_stack_queue.bai_tap.count_words_in_a_string;
//
//import java.util.Scanner;
//
//public class controller {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        CountWordsService countWords = new CountWordsService();
//        int luaChon = 1;
//        do {
//            System.out.println("-----------------MENU-------------------");
//            System.out.println("1. them dữ liệu\n" +
//                    "2. in dữ liệu\n" +
//                    "3.in hoa dữ liệu với từ khóa tương ứng.\n" +
//                    "4. kiểm tra từ khóa đã tồn tại hay chưa?\n" +
//                    "5. xóa từ khóa\n" +
//                    "0. thoát");
//            luaChon = Integer.parseInt(sc.nextLine());
//            if (luaChon == 2) {
//                countWords.print();
//                continue;
//            }
//            System.out.println("thêm từ khóa ");
//            String key = sc.nextLine();
//            switch (luaChon) {
//                case 1:
//                    System.out.println("thêm giá trị");
//                    String value = sc.nextLine();
//                    countWords.add(key, value);
//                    break;
//
//                case 3:
//                    System.out.println(key + ": " + countWords.getValueToLowerCase(key));
//                    break;
//                case 4:
//                    System.out.println(countWords.checkForExistence(key));
//                    if (countWords.checkForExistence(key)) {
//                        System.out.println("key này đã tồn tại bạn có muốn ghi đè ?");
//                        System.out.println("thêm value muốn ghi đè");
//                        String value1 = sc.nextLine();
//                        countWords.overLoad(key, value1);
//
//                    } else if (!countWords.checkForExistence(key)) {
//                        System.out.println("bạn có muốn thêm key\n " +
//                                "1. yes\n" +
//                                "2. no");
//                        int luaChon1=1;
//                        do {
//                            luaChon1 = sc.nextInt();
//                            if (luaChon1 == 1) {
//                                System.out.println("thêm value vào key");
//                                String value2 = sc.nextLine();
//                                countWords.add(key, value2);
//                            } else if (luaChon1 != 1 && luaChon1 != 2) {
//                                System.out.println("error mời nhập lại");
//                            }
//                        } while (luaChon != 2);
//
//                    }
//
//
//                    break;
//                case 5:
//                    System.out.println("dã xóa " + countWords.remove(key));
//                    break;
//                default:
//                    System.out.println("nhập chưa đúng");
//            }
//
//        } while (luaChon != 0);
//
//    }
//}
