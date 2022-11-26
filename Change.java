package experience5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in,"gbk");
		StringBuffer a = new StringBuffer(sc.next());
		String d = a.toString();
		int i, b = 1;
		for (i = 7; i <= a.length(); i = 8 * b - 1) {
			if (b % 2 == 1) {
				a.insert(i, ",");
				b++;
			} else {
				a.insert(i, "。");
				b++;
			}
		}
		int c = 1;
		for (i = 16; i <= a.length(); i = 16 * c + c - 1) {
			a.insert(i, '\n');
			c++;
		}
		System.out.println(a);
		System.out.println("请输入您要查找的文字:");
		Scanner f = new Scanner(System.in,"gbk");
		String e = f.next();
		Search.b(d, e);
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/audience/Desktop/新建 文本文档.txt"));
			pw.print(a);
			pw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}