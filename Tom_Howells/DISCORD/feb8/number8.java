class number6a {
	private int attribute;

	public number6a() {
		attribute = 17;
	}

	public String toString() {
		return attribute;
	}
}

class number7a {
	private int attribute;

	public number7a(int n) {
		attribute = n;
	}
	public number7a() {
		this(17);
	}

	public String toString() {
		return attribute;
	}
}