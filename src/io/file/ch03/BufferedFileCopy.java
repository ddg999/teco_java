package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// 기반 스트림 + 보조 스트림을 활용해서 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오
		String sourceFilePath = "C:\\Users\\GGG\\Documents\\Lightshot\\a.zip";
		String destinationFilePath = "copy3.zip";

		long startTime = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(sourceFilePath);
				FileOutputStream fos = new FileOutputStream(destinationFilePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			int data;
			while ((data = bis.read()) != -1) {
				// 파일에 출력
				bos.write(data);
			}
			bos.flush();

		} catch (Exception e) {
			e.printStackTrace(); // 파일 저장 기능도 가능
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("소요 시간 : " + duration);

		double seconds = duration / 1_000_000_000.0;
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		System.out.println(resultFormat);
	}
}
