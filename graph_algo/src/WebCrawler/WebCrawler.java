package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;
	private int result;
	//constructor
	public WebCrawler() {
		this.discoveredWebsiteList=new ArrayList<>();
		this.queue=new LinkedList<>();
		this.result=0;
		
	}
	public void discoverWeb(String root) {
		this.queue.add(root);
		this.discoveredWebsiteList.add(root);
		
		while(!queue.isEmpty()) {
			String v=this.queue.remove();
			String rawUrl=readUrl(v);
			String regexp="https://(\\w+\\.)*(\\w+)";
			Pattern pattern=Pattern.compile(regexp);
			Matcher matcher=pattern.matcher(rawUrl);
			while(matcher.find()) {
				String actualUrl=matcher.group();
				if(!discoveredWebsiteList.contains(actualUrl)) {
					discoveredWebsiteList.add(actualUrl);
					System.out.println("actualUrl: "+actualUrl);
					result++;
					queue.add(actualUrl);
				}
			}
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Total refrences found:-"+result);
		
	}
	private String readUrl(String v) {

		String rawHtml="";
		try {
			URL url=new URL(v);
			BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine="";
			while((inputLine=in.readLine())!=null) {
				rawHtml+=inputLine;
			}
			
			in.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
		return rawHtml;
	}
	
	
	
}
