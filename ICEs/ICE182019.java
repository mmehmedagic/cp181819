public class ICE182019 {
    public static void main(String[] args) {
        String str = "Programming 1";
        String strSub1 = str.substring(0, 4);
        String strSub2 = str.substring(5);

        System.out.println(strSub1 + strSub2);
            
        str = "computer science";
		String comp = str.substring(0, 4);
		String sci = str.substring(9,12);

		System.out.println(comp + " " + sci);

		String s = str.substring(9);

		System.out.println(s + " rocks!");
    }

}