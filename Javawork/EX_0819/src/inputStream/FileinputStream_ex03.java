package inputStream;

public class FileinputStream_ex03 {
	public static void main(String[] args) {
		byte[] keyboard = new byte[100];
		
		try {
			System.out.println("값 : ");
			System.in.read(keyboard);
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
