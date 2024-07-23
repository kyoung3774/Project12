package generic;

public class Ex03 {

	public static void main(String[] args) {
		
		// 파우더를 사용하는 프린터기 생성
		TreeDPrinter<Powder> printer1 = new TreeDPrinter<>();
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		powder.doPrinting();
		
		// 플라스틱을 사용하는 프린터기 생성
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}
}

// 제네릭 클래스 만들기
class TreeDPrinter<T> { // 공통 분모인 부모타입을 범용적으로 사용하기 위한 제네릭(최상위 부모인 Object)

	private T material; // Object대신 문자 T작성

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

}