package ss13_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;

import java.util.Arrays;

public class Service {
    public void sapXepChen(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int pos = i;
            while (pos > 0 && min < arr[pos - 1]) {

                arr[pos] = arr[pos - 1];

                pos--;
            }
            arr[pos] = min;
        }
        System.out.println(Arrays.toString(arr));

    }
}
