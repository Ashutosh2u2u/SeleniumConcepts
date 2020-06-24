package ocrDemo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCRcaptcha {

	public static void main(String[] args) {
		ITesseract image=new Tesseract();
		try {
			String str=image.doOCR(new File("D:\\Automation\\MyFramework\\FrameworkNew\\MyLearning\\images\\capcha.png"));
			System.out.println("Data from image is " + str);
		} 
		catch (TesseractException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
