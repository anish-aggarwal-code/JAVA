package firstPackage;

import java.util.ArrayList;

public class practice {
	public static void main(String[] args) {
		System.out.println(maze(3, 3));
		System.out.println(path("", 3, 3));

	}

	public static int maze(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}
		int dec_row = maze(r - 1, c);
		int dec_col = maze(r, c - 1);
		int dec_dia = maze(r - 1, c - 1);
		return dec_row + dec_col + dec_dia;
	}

	public static ArrayList<String> path(String p, int r, int c) {
		if (r == 1 && c == 1) {

			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if (r > 1) {
			if (r != 2 || c != 2) {
				list.addAll(path(p + 'D', r - 1, c));
			} else {
				return list;
			}
		}
		if (c > 1)

		{
			if (r != 2 || c != 2) {
				list.addAll(path(p + 'R', r, c - 1));
			} else {
				return list;
			}
		}
//		if(c>1 && r>1)
//		{
//			list.addAll(path(p+'A',r-1,c-1));
//		}
//		return list;
          if(c<3)
			
		{
			if(r!=2 || c!=2) {
			list.addAll(path(p+'L',r,c+1));}
			else
			{
				return list;
			}
		}
		return list;
	}

}
