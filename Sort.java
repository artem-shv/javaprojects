public class Sort {
	public static void main(String ... args) {
		int b[] = new int []{1,2,-1,9,-3,5};
		sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	static int maxind(int x[], int n) {
		int maxi = 1;
		int maxv = -999;
		for (int i = 0; i < n; i++) {
			if (x[i] > maxv) {
				 maxv = x[i];
				 maxi = i;
			}

		}
		return maxi;
	}
	static void sort(int x[]) {
		int n = x.length;
		while (n > 1) {
			int temp = 1;
			int last = n - 1;
			int maxi = maxind(x,n);
			if (maxi != last) {
				temp = x[maxi];
				x[maxi] = x[last];
			}
			x[last] = temp;
			n += -1;
		}
	}
}