package study.emxaple1;

public class Circle {
	/**
	 * @param args
	 */
		/*직사각형 클래스(Rect)
		 * 직사각형 생성을 위해서 필요한 요소를 멤버 변수로
		 * 직사각형을 나타내기 위한 기능들을 멤버 메소드로 구현하여 main
		 * 메소드에서 테스트해보세요.
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


