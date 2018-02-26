package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class retrieveData
{
	private String date;
	private String time;
	private String perfiosTransId;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPerfiosTransId() {
		return perfiosTransId;
	}
	public void setPerfiosTransId(String perfiosTransId) {
		this.perfiosTransId = perfiosTransId;
	}
}

public class retrieval {

	public static void main(String[] args) throws Exception{
		BufferedReader reader=new BufferedReader(new FileReader("/home/muralidar/logfile/kubera.01-12-2017.log"));
        String regex="(INFO)([\\s]+)([\\d]+)([\\s]+)([\\d]+[-][\\d]+[-][\\d]+)([\\s]+)([\\d]+[:][\\d]+[:][\\d]+)([\\s]+)(\\[Retrieve])([a-zA-Z ]+)(\\[perfiosTransactionId=)([a-zA-Z0-9]+)";
        Pattern pattern=Pattern.compile(regex);
        String line;
        ArrayList<retrieveData> records=new ArrayList<>();
        while((line=reader.readLine())!=null)
        {
        	retrieveData data=new retrieveData();
        	Matcher matcher=pattern.matcher(line);
        	if(matcher.find())
        	{
        		data.setDate(matcher.group(5));
        		data.setTime(matcher.group(7));
        		data.setPerfiosTransId(matcher.group(12));
        		records.add(data);
        	} 
        }
        

        for(retrieveData data:records)
         System.out.println(data.getDate()+"\t"+data.getTime()+"\t"+data.getPerfiosTransId());
	    
        System.out.println(records.size());
 }
}	
