package No10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); //��������� �о�帱�� �ִ� ���� �߰�
        int c = Integer.parseInt(st.nextToken()); //���ٿ��� ���� ������ ����
        int d = Integer.parseInt(st.nextToken()); //���ٿ��� ���� ������ ����
        System.out.println(c + " " + d);

        st = new StringTokenizer(br.readLine(),","); // , ������ �о�帱�� �ִ� ���� �߰�
        int e = Integer.parseInt(st.nextToken()); //���ٿ��� , ������ ����
        int f = Integer.parseInt(st.nextToken()); //���ٿ��� , ������ ����
        System.out.println(e + " " + f);
	}
}