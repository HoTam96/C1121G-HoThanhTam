package case_study_c10.product.impl;

import case_study_c10.data.NotFoundProductException;
import case_study_c10.data.ReaderFileCsv;
import case_study_c10.data.WriteFileCsv;
import case_study_c10.models.ImportedProduct;
import case_study_c10.models.Product;
import case_study_c10.product.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportProductImpl implements IProductService {
    public static final String PATH_IMPORT = "src/case_study_c10/view/ultill/ImportProduct.csv";

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        List<Product> importList = ReaderFileCsv.readerFile(PATH_IMPORT);
        int id = 1;
        if (!importList.isEmpty()) {
            id = importList.get(importList.size() - 1).getId() + 1;
        }
        System.out.println("nhập mã sản phẩm");
        String productCode = scanner.nextLine();
        while (true){
        if (productCode.equals("")) {
            System.out.println("bạn chưa nhập productCode yêu cầu nhập lại");
            productCode= scanner.nextLine();
        }else{
            break;
        }
        }

        System.out.println("nhập tên sản phẩm");
        String productName = scanner.nextLine();
        while (true){
            if (productName.equals("")) {
                System.out.println("bạn chưa nhập productName yêu cầu nhập lại");
                productName= scanner.nextLine();
            }else{
                break;
            }
        }

        System.out.println("nhập giá sản phẩm ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("nhập số lượng sẩn phẩm");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.println("nhà sản xuất");
        String producer = scanner.nextLine();
        while (true){
            if (producer=="") {
                System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                producer= scanner.nextLine();
            }else{
                break;
            }
        }
        System.out.println("giá nhập khẩu");
        double pricrImport = Double.parseDouble(scanner.nextLine());

        System.out.println("tỉnh thành nhập khẩu");
        String provinceImport = scanner.nextLine();
        while (true){
            if (provinceImport=="") {
                System.out.println("bạn chưa nhập producer yêu cầu nhập lại");
                provinceImport= scanner.nextLine();
            }else{
                break;
            }
        }
        System.out.println("thuế");
        double tax = Double.parseDouble(scanner.nextLine());

        List<Product> importedProductList = new ArrayList<>();
        Product importedProduct = new ImportedProduct(id, productCode, productName, price, amount, producer, pricrImport, provinceImport, tax);
        importedProductList.add(importedProduct);
        WriteFileCsv.writeFileCsv(importedProductList, PATH_IMPORT, true);
    }

    @Override
    public void delete() {
        List<Product> importList = ReaderFileCsv.readerFile(PATH_IMPORT);
        String productId;
        Scanner scanner = new Scanner(System.in);
        while (true){
        try {
        System.out.println("nhập vào mã sản phẩm để xóa");
        productId = scanner.nextLine();
        boolean check = true;
        for (Product element : importList) {
            if (element.getProductCode().equals(productId)) {
                System.out.println("bạn có muốn xóa sản phẩm này ra khỏi danh sách không");
                System.out.println("1. yes");
                System.out.println("số bất kì. No");
                check = true;
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    importList.remove(element);
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
            throw new NotFoundProductException("không tìm thấy sản phẩm");
        }
        WriteFileCsv.writeFileCsv(importList,PATH_IMPORT,false);
        }catch (NotFoundProductException e){
            e.getMessage();
            System.out.println("nhập lại sản phẩm để xóa");
            productId= scanner.nextLine();
        }
    }
    }

    @Override
    public void disPlay() {
        List<Product> importList = ReaderFileCsv.readerFile(PATH_IMPORT);
        for (Product element : importList) {
            System.out.println(element);
        }

    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm cần tìm kiếm");
        String productName =scanner.nextLine();
        List<Product> importList = ReaderFileCsv.readerFile(PATH_IMPORT);
        for (Product element:importList) {
            if (element.getProductName().contains(productName)){
                System.out.println(element);
            }
        }
    }
}
