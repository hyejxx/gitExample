package ch19;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlInfo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.youtube.com/watch?v=M1IHTPEZoPI");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트: " + url.getPort());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파일 : " + url.getFile());
			System.out.println("기타 : " + url.toExternalForm());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
