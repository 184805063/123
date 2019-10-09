import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java,io.*;
public class XMLUtil{
public static Object getBean(){
try{
DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = dFactory.newDocumentBuilder();
Document doc = builder.parse(new File("conflg.xml"));
NodeList nl = doc.getElementsByTagName("className");
Node classNode = nl.item(0).getFirstChild();
String cName = classNode.getNodeValue();
Class c = Class.forName(cName);
Object obj = c.newInstance();
return obj;
}
catch(Exception e){
e.printStackTrace();
return null;
}}
public class Main{
public static void main(Stirng[] args){
TV tv;
Factory factory;
factory = (TVFactory)XMLUtil.getBean();
tv = factory.produceTV();
tv.play();
}}
