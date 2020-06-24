package ocrDemo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCRtest {

	public static void main(String[] args) {
		ITesseract image=new Tesseract();
		try {
			String str=image.doOCR(new File("D:\\Automation\\MyFramework\\FrameworkNew\\MyLearning\\images\\TestCaptcha.png"));
			String subPart=str.split("Type")[0];
			String captchaTxt=subPart.split("Captcha")[1];
			System.out.println("Data from image is " + str);
			System.out.println(captchaTxt);
		} 
		catch (TesseractException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
