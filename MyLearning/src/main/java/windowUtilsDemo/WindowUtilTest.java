package windowUtilsDemo;
import org.openqa.selenium.os.WindowsUtils;
public class WindowUtilTest {

	public static void main(String[] args) {
		System.out.println("=======How to kill unused process in Selenium using windowsUtils Class==========");
		// TODO Auto-generated method stub
		//windowUtils -OS Process
		//limited resources-Releaseunused process
		//precondition-Before running test
		//WindowsUtils.killByName("chrome.exe");
		//WindowsUtils.killByName("Skype.exe");
		WindowsUtils.killByName("tomcat8.exe.x64");
		//tomcat8.exe.x64
		System.out.println(WindowsUtils.getProgramFilesPath());
		System.out.println(WindowsUtils.thisIsWindows());
		

	}

}
