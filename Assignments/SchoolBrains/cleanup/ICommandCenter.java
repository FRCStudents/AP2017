package skulbrains;

import skulbrains.ClassBook;
import skulbrains.Category;
import skulbrains.Assignment;
import skulbrains.User;
import skulbrains.Score;
import skulbrains.DataHold;

import skulbrains.DateString;

import java.util.Scanner;

public interface ICommandCenter {
	public boolean doCommand(int r);
        public boolean doStudentCommand(int r);
        public boolean doScoresCommand(int r);

}

