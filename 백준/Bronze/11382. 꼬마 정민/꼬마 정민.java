import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long sum = 0;

		while (st.hasMoreElements()) {
			long st_num = Long.parseLong(st.nextToken());
			sum += st_num;

		}

		bw.write(sum + "");

		br.close();
		bw.close();
	}
}