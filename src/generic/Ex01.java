package generic;

// 재료로 사용할 파우더 클래스
class Powder {

	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}

	public String toString() {
		return "재료는 Powder";
	}
}

// 재료로 사용할 플라스틱 클래스
class Plastic {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}

	public String toString() {
		return "재료는 Plastic";
	}
}

// 파우더를 재료로 사용하는 프린터 만들기
class ThreeDPrinter1 {
	
	private Powder material; // 변수의 자료형을 Powder 선언

	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
}

// 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter2 {
	
	private Plastic material; // 변수의 자료형을 Plastic 선언

	public Plastic getMaterial() {
		return material;
	}

	public void setMaterial(Plastic material) {
		this.material = material;
	}
}