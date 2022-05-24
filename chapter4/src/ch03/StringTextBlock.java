package ch03;

public class StringTextBlock {

    public static void main(String[] args) {

        // JDK 15 이상부터 지원
//        String strBlock = """
//				This
//				is
//				text
//				block
//				test.""";
//        System.out.println(strBlock);

        System.out.println(getBlockOfHtml());

    }

    public static String getBlockOfHtml() {
        return "";
//        return """
//		            <html>
//
//		                <body>
//		                    <span>example text</span>
//		                </body>
//		            </html>""";

    }

}
