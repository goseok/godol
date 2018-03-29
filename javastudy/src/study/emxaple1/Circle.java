package study.emxaple1;

public class Circle {
	/**
	 * @param args
	 */
		/*���簢�� Ŭ����(Rect)
		 * ���簢�� ������ ���ؼ� �ʿ��� ��Ҹ� ��� ������
		 * ���簢���� ��Ÿ���� ���� ��ɵ��� ��� �޼ҵ�� �����Ͽ� main
		 * �޼ҵ忡�� �׽�Ʈ�غ�����.
		 */
		private int centerX;
		private int centerY;
		private double redius;
		
		public int getCenterX() {
			return centerX;
		}
		public void setCenterX(int centerX) {
			this.centerX = centerX;
		}
		public int getCenterY() {
			return centerY;
		}
		public void setCenterY(int centerY) {
			this.centerY = centerY;
		}
		public double getRedius() {
			return redius;
		}
		public void setRedius(double redius) {
			this.redius = redius;
		}
		public Circle() {
			this.setCenter(0,0);
			this.setRedius(5.0);
		}
		public Circle(int x, int y, double r) {
			this.setCenter(x,y);
			this.setCenter(10,0);
		}
		public Circle(Circle c) {
			this.setCenter(c.centerX, c.centerY);
			this.setRedius(c.redius);
		}
		public void setCenter(int x, int y) {
			this.setCenterX(x);
			this.setCenterY(y);
			
			}
		}


