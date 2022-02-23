package ss12_thuat_toan_tim_kiem.thuc_hanh.implement_binary_tree_search;

public class SettingBinaryTree {
    public int binaryTree(int[] list,int data){

        int low =0;
        int hight = list.length-1;
        while (hight>=low){
            int mid = (hight+low)/2;
            if (data<list[mid]){
                hight--;
            }
            else if (data>list[mid]){
                low++;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SettingBinaryTree settingBinaryTree = new SettingBinaryTree();
        int []arr =  new int[]{3,4,7,9,11,56,58,68,78,82,84,94,97};
        System.out.println(settingBinaryTree.binaryTree(arr,711));
    }
}
