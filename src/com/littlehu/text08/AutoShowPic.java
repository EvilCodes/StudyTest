package com.littlehu.text08;

public class AutoShowPic implements PicDisplay{
	
	private PicAdapter adapter;

	
	public AutoShowPic() {
	}

	@Override
	public void show(String format) {
		if (format.equals("GIF")) {
			System.out.println("this is a gif");
		}else if (format.equals("PNG")||format.equals("JPEG")) {
			adapter=new PicAdapter();
			adapter.show(format);
			
		}else {
			System.out.println("��Ч��ͼƬ��ʽ");
		}
		
	}

}
