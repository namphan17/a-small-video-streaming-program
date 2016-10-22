//VideoStream

import java.io.*;

/**
 * This class is used to read video data from the file on disk.
 * @author http://media.pearsoncmg.com/aw/aw_kurose_network_3/labs/lab7/Client.html
 * @version 10/21/2016
 */
public class VideoStream {

  FileInputStream fis; //video file
  int frame_nb; //current frame nb

  //-----------------------------------
  //constructor
  //-----------------------------------
  /**
 * @param filename
 * @throws Exception
 */
public VideoStream(String filename) throws Exception{

    //init variables
    fis = new FileInputStream(filename);
    frame_nb = 0;
  }

  //-----------------------------------
  // getnextframe
  //returns the next frame as an array of byte and the size of the frame
  //-----------------------------------
  /**
 * @param frame
 * @return
 * @throws Exception
 */
public int getnextframe(byte[] frame) throws Exception
  {
    int length = 0;
    String length_string;
    byte[] frame_length = new byte[5];

    //read current frame length
    fis.read(frame_length,0,5);
	
    //transform frame_length to integer
    length_string = new String(frame_length);
    length = Integer.parseInt(length_string);
	
    return(fis.read(frame,0,length));
  }
}