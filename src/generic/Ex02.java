package generic;

public class Ex02 {

	public static void main(String[] args) {

		ThreeDPrinter3 priner = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); // Powder를 재료로 선택
		priner.setMaterial(p1);	// Object meterial = new Powder();
		Object object = priner.getMaterial();
		Powder p2 = (Powder)object; // 재료를 꺼낼때는 직접 형변환을 해야함
		p2.doPrinting();
	}

}

// 파우더와 플라스틱을 재료로 사용하는 프린터 클래스
class ThreeDPrinter3 {
	
	private Object material; // 변수의 자료형을 Object 선언 (파우더, 플라스틱 모두 저장할 수 있음)

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
}