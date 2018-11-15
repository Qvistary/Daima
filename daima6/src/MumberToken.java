import java.util.*;//6-6
public class MumberToken{
public static void main(String args[]){
String s="I am Xing.zh.l,she is my girlfriend";
StringTokenizer fenxi=new StringTokenizer(s," ,"); 
int number=fenxi.countTokens();
while(fenxi.hasMoreTokens()){
String str=fenxi.nextToken();
System.out.println(str);
System.out.println("还剩"+fenxi.countTokens()+"个单词");
}
System.out.println("s共有单词"+number+"个");
}
}
