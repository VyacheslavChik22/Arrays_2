import java.util.Arrays;

public class arrays_2 {
    public static void main(String[] args) {
        int payForMonth = 0;
        int minPay = 0;
        int maxPay = 0;
        double averagePayForMonth = 0;

        int[] arr = new int[30];                     // ��������� ������ � ������ � 30 ���������
        for (int i = 0; i < arr.length; i++) {       // ������� �������� �������, ����������� ������� �������� ��������� ����� �
            // ���������� �� 100 �� 200
            arr[i] = (int) (Math.random() * 100) + 101;   // int ����������� ����� ����� ������� � ����� �������� 200 ����� + 101
            payForMonth += arr[i];                        // ����� �������� ���� ��������� �������.


        }
//������� 1: ��������� ����� ���� ������ �� �����.

        System.out.println(Arrays.toString(arr)); //���������� �������
        System.out.println("\n*** �������1 - ����� ���� ������ � ����� ***");
        System.out.println("����� ������ �� ����� ���������: " + payForMonth + " ������.");



//������� 2 ����� ����������� � ������������ ����� �� ����.
        System.out.println("\n*** �������2 - ����������� � ������������ ����� �� ���� ***");

        Arrays.sort(arr); // ��������� ������: arr[0] - ����������� ��������,  arr[29] -������������ ��������.
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("����������� ����� ���� �� ���� ��������� " + arr[0] + " ������. ������������ ����� ���� �� ���� " +
                "��������� " + arr[29] + " ������.");

//������� 3 ������� ����� ���� � ������� ������ 30 ����.
        System.out.println("\n*** �������3 - ������� ����� �� ����� ***");
        averagePayForMonth = payForMonth / arr.length; // ����� �������� ���� ��������� ������� ����� �� ��� ������

        System.out.println("������� ����� ���� �� ����� ���������: "+ averagePayForMonth +" ������.");


//������� 4: �������� ��� - ���-�� ����� ��� ���.

        System.out.println("\n*** �������4 - ��������� ��� � ������� �����������. ***");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'}; // ����� ���������� ������
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println();
        for (int i = reverseFullName.length-1; i >= 0; i--) { // ������� �������� ������� �� ����� �� ������
            System.out.print(reverseFullName[i] + " ");       // ������� � �������
        }


    }

}
