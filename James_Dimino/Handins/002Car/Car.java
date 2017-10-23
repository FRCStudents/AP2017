public class Car {

// Directions are North, South, East and West
		
		int Wheels = 4;
		String Drive = "2";
		int Current_Speed = 30;
		String Current_Direction = "North";

		String getCurrent_Direction() {
			return Current_Direction;
		}

		void setCurrent_Direction(String New_Direction) {
			Current_Direction = New_Direction;
		}

		int getCurrent_Speed() {
			return Current_Speed;
		}

		void setCurrent_Speed(int New_Speed) {
			Current_Speed = New_Speed;
		}

		public String toString() {
			return "GoBaby";
		}

}
	
