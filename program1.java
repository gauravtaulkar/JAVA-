import java.net.*;
import java.awt.*;
import java.io.*;

class OpenWebsite {

	public static void main(String []args)throws Exception{

		String url="https://www.core2web.in";
		URI obj = new URI(url);
		Desktop de= Desktop.getDesktop();
		de.browse(obj);
	}
}
