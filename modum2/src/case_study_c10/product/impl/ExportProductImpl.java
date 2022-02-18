package case_study_c10.product.impl;

import case_study_c10.data.ReaderFileCsv;
import case_study_c10.data.WriteFileCsv;
import case_study_c10.models.ExportProduct;
import case_study_c10.models.ImportedProduct;
import case_study_c10.models.Product;
import case_study_c10.product.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportProductImpl implements IProductService {
    public static final String PATH_EXPORT = "src/case_study_c10/view/ultill/ExportProdut.csv";

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        List<Product> exportList = ReaderFileCsv.readerFile(PATH_EXPORT);
        int id = 1;
        if (!exportList.isEmpty()) {
            id = exportList.get(exportList.size() - 1).getId() + 1;
        }
        System.out.println("nhập mã sản phẩm");
        String productCode = scanner.nextLine();

        System.out.println("nhập tên sản phẩm");
        String productName = scanner.nextLine();

        System.out.println("nhập giá sản phẩm ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập số lượng sẩn phẩm");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.println("nhà sản xuất");
        String producer = scanner.nextLine();
        System.out.println("giá xuất khẩu");
        double pricrExport = Double.parseDouble(scanner.nextLine());
        System.out.println("đất nước nhập khẩu");
        String countryExport = scanner.nextLine();
        List<Product> exportProductList = new ArrayList<>();
        Product exportProduct = new ExportProduct(id, productCode, productName, price, amount, producer, pricrExport, countryExport);
        exportProductList.add(exportProduct);
        WriteFileCsv.writeFileCsv(exportProductList, PATH_EXPORT, true);
    }

    @Override
    public void delete() {
        List<Product> exportList = ReaderFileCsv.readerFile(PATH_EXPORT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào mã sản phẩm để xóa");
        String productId = scanner.nextLine();
        boolean check = true;
        for (Product element : exportList) {
            if (element.getProductCode().equals(productId)) {
                System.out.println("bạn có muốn xóa sản phẩm này ra khỏi danh sách không");
                System.out.println("1. yes");
                System.out.println("phím bất kì. No");
                check = true;
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    exportList.remove(element);
                    System.out.println("sản phẩm đã được xóa");
                    break;
                } else {
                    System.out.println("bạn đã chọn không xóa sản phẩm");
                }

            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("sản phẩm không tồn tại trong danh sách");
        }
        WriteFileCsv.writeFileCsv(exportList,PATH_EXPORT,false);

    }

    @Override
    public void disPlay() {
        List<Product> productList = ReaderFileCsv.readerFile(PATH_EXPORT);
        for (Product element : productList) {
            System.out.println(element);
        }

    }

    @Override
    public void search() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm cần tìm kiếm");
        String productName =scanner.nextLine();
        List<Product> exportList = ReaderFileCsv.readerFile(PATH_EXPORT);
        for (Product element:exportList) {
            if (element.getProductName().contains(productName)){
                System.out.println(element);
            }
        }

    }
}
