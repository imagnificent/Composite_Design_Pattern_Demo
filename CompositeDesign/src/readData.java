import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readData {
	// static method for reading XML file from local disk
    public static String readXMLFile(String path) {
        String result = null;
        try{
            BufferedReader br = null;
            Pattern compile = Pattern.compile("&#.*?;");
            br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null)
            {
                Matcher matcher = compile.matcher(line);
                while (matcher.find()) {
                    String group = matcher.group();
                    String hexcode = "0" + group.replaceAll("(&#|;)", "");
                    line = line.replaceAll(group, (char) Integer.decode(hexcode).intValue() + "");
                }
                result += line + "\r\n";
            }

        } catch (Exception e) { e.printStackTrace(); }
        return result;
    }

    //static method for parsing XML file, gathering useful data and creating or operating objects
    public static List<Component> parseXMLFile(String result) {
        Pattern patternItem = Pattern.compile("<item>(.*?)</item>");
        Matcher matchItem = patternItem.matcher(result);
        List<Component> bookshelf = new ArrayList<Component>();
        while(matchItem.find()) {
            String item = matchItem.group(0);
            String title = getParameter(item,"title").split("\\.")[1];
            Information link = new Information("link",getParameter(item,"link"));
            Information description = new Information("description",getParameter(item,"description"));
            List<Component> informationList = new ArrayList<Component>();
            BookCollection bookCollection = new BookCollection(title, informationList);
            bookCollection.add(link);
            bookCollection.add(description);
            bookshelf.add(bookCollection);
        }
        return bookshelf;
    }

    public static String getParameter(String item, String parameter) {
        String result="";
        StringBuffer itemBuffer = new StringBuffer();
        itemBuffer.append("<");
        itemBuffer.append(parameter);
        itemBuffer.append(">(.*?)</");
        itemBuffer.append(parameter);
        itemBuffer.append(">");
        Pattern pattern=Pattern.compile(itemBuffer.toString());
        Matcher matcher=pattern.matcher(item);
        if (matcher.find()){
            String paraGroup = matcher.group();
            StringBuffer preParaBuffer = new StringBuffer();
            StringBuffer postParaBuffer = new StringBuffer();
            preParaBuffer.append("<");
            preParaBuffer.append(parameter);
            preParaBuffer.append(">*");
            postParaBuffer.append("</");
            postParaBuffer.append(parameter);
            postParaBuffer.append(">*");
            result = (paraGroup.replaceAll(preParaBuffer.toString(), "")).replaceAll(postParaBuffer.toString(), "");
        }
        return result;
    }
}