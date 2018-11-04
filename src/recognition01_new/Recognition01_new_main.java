package recognition01_new;

import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class Recognition01_new_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recognition_lib rlib = new Recognition_lib();
		String file = "img/seki.jpg";
		DetectedFaces result = rlib.recognition(file);
		
		rlib.json(result);


				
				
				
				
	}

}