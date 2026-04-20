package week3_kaka.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File ("nikujaga.txt");
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileWriter fw = new FileWriter(file);
	             BufferedWriter bw = new BufferedWriter(fw)){
			bw.write("carrot");
			bw.newLine();
			bw.write("potato");
			bw.newLine();
			bw.write("meat");
			bw.newLine();
			bw.write("onion");
			bw.newLine();
		} catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            e.printStackTrace();
        }
		try (FileReader fr = new FileReader(file);
	             BufferedReader br = new BufferedReader(fr)) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
		} catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
