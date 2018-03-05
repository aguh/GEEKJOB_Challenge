/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author guest1Day
 */
public class file {
    public static void main(String[] args) throws IOException  {
          //ファイルを開く
         File mine = new File("test.txt");
         FileWriter fw = new FileWriter(mine);
         fw.write("おおはま　6/2　双子座");
         fw.close();
      }
}
