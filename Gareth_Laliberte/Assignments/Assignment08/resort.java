class resort {

	private int temp;

	Resort() {
		temp = 65;
	}

	Resort (int a) {
		temp = a;
	}


	public int getTemp() {
		return temp;
	}
	public String returnActivity() {
		if ((temp > 95) || (temp < 20)) {
			return "Weather's a bit uncomfortable. Check out our air-conditioned shops!";
		}
		if ((temp >= 80) && (temp <= 95)) {
			return "Looks like perfect weather for a swim!";
		}
		if ((temp >= 60) && (temp < 80)) {
			return "What a nice sunny day! Time for some tennis, maybe?";
		}
		if ((temp >= 40) && (temp < 60)) {
			return "There's a bit of a cold breeze today! Why not take advantage of it by playing some golf?";
		}
		if ((temp < 40) && (temp >= 20)) {
			return "Brrr, how brisk! Hey, head over to our skiing slopes and enjoy the cold!";
		}
		return "";
	}
}

}